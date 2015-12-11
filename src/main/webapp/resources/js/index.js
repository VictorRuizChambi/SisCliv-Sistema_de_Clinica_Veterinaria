(function() {
  angular.module('testMod', []).controller('testCtrl', function($scope) {
    return $scope.date = new Date();
  }).directive('timeDatePicker', [
    '$filter', '$sce', function($filter, $sce) {
      return {
        restrict: 'AE',
        replace: true,
        scope: {
          _modelValue: '=ngModel'
        },
        require: 'ngModel',
        templateUrl: 'time-date.tpl',
        link: function(scope, element, attrs, ngModel) {
          var ref;
          scope._mode = (ref = attrs.defaultMode) != null ? ref : 'date';
          scope._displayMode = attrs.displayMode;
          ngModel.$render = function() {
            scope.date = ngModel.$modelValue != null ? new Date(ngModel.$modelValue) : new Date();
            scope.calendar._year = scope.date.getFullYear();
            scope.calendar._month = scope.date.getMonth();
            return scope.clock._minutes = scope.date.getMinutes();
          };
          scope.save = function() {
            return scope._modelValue = scope.date;
          };
          return scope.cancel = function() {
            return ngModel.$render();
          };
        },
        controller: [
          '$scope', function(scope) {
            scope.date = new Date();
            scope.display = {
              title: function() {
                if (scope._mode === 'date') {
                  return $filter('date')(scope.date, 'EEEE h:mm a');
                } else {
                  return $filter('date')(scope.date, 'MMMM d yyyy');
                }
              },
              "super": function() {
                if (scope._mode === 'date') {
                  return $filter('date')(scope.date, 'MMM');
                } else {
                  return '';
                }
              },
              main: function() {
                return $sce.trustAsHtml(scope._mode === 'date' ? $filter('date')(scope.date, 'd') : ($filter('date')(scope.date, 'h:mm')) + "<small>" + ($filter('date')(scope.date, 'a')) + "</small>");
              },
              sub: function() {
                if (scope._mode === 'date') {
                  return $filter('date')(scope.date, 'yyyy');
                } else {
                  return $filter('date')(scope.date, 'HH:mm');
                }
              }
            };
            scope.calendar = {
              _month: 0,
              _year: 0,
              _months: ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
              offsetMargin: function() {
                return (new Date(this._year, this._month).getDay() * 3.6) + "rem";
              },
              isVisible: function(d) {
                return new Date(this._year, this._month, d).getMonth() === this._month;
              },
              "class": function(d) {
                if (new Date(this._year, this._month, d).getTime() === new Date(scope.date.getTime()).setHours(0, 0, 0, 0)) {
                  return "selected";
                } else if (new Date(this._year, this._month, d).getTime() === new Date().setHours(0, 0, 0, 0)) {
                  return "today";
                } else {
                  return "";
                }
              },
              select: function(d) {
                return scope.date.setFullYear(this._year, this._month, d);
              },
              monthChange: function() {
                if ((this._year == null) || isNaN(this._year)) {
                  this._year = new Date().getFullYear();
                }
                scope.date.setFullYear(this._year, this._month);
                if (scope.date.getMonth() !== this._month) {
                  return scope.date.setDate(0);
                }
              }
            };
            scope.clock = {
              _minutes: 0,
              _hour: function() {
                var _h;
                _h = scope.date.getHours();
                _h = _h % 12;
                if (_h === 0) {
                  return 12;
                } else {
                  return _h;
                }
              },
              setHour: function(h) {
                if (h === 12 && this.isAM()) {
                  h = 0;
                }
                h += !this.isAM() ? 12 : 0;
                if (h === 24) {
                  h = 12;
                }
                return scope.date.setHours(h);
              },
              setAM: function(b) {
                if (b && !this.isAM()) {
                  return scope.date.setHours(scope.date.getHours() - 12);
                } else if (!b && this.isAM()) {
                  return scope.date.setHours(scope.date.getHours() + 12);
                }
              },
              isAM: function() {
                return scope.date.getHours() < 12;
              }
            };
            scope.$watch('clock._minutes', function(val) {
              if ((val != null) && val !== scope.date.getMinutes()) {
                return scope.date.setMinutes(val);
              }
            });
            scope.setNow = function() {
              return scope.date = new Date();
            };
            scope._mode = 'date';
            scope.modeClass = function() {
              if (scope._displayMode != null) {
                scope._mode = scope._displayMode;
              }
              if (scope._displayMode === 'time') {
                return 'time-only';
              } else if (scope._displayMode === 'date') {
                return 'date-only';
              } else if (scope._mode === 'date') {
                return 'date-mode';
              } else {
                return 'time-mode';
              }
            };
            return scope.modeSwitch = function() {
              var ref;
              return scope._mode = (ref = scope._displayMode) != null ? ref : scope._mode === 'date' ? 'time' : 'date';
            };
          }
        ]
      };
    }
  ]);

}).call(this);