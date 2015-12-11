
package com.recursos;

import javax.persistence.NamedQuery;


public class SQLConstants {
	public static class SQLUserAccount{
		public static final String QUERY_FIND_ROLES_BY_USER = "RolUserAccount.findRolesByUser";
		public static final String DELETE_ROLES_ASSIGNED_BY_USER = "RolUserAccount.deleteRolesAssignedByUser";
		public static final String QUERY_FIND_BY_ID= "UserAccount.findById";
		public static final String QUERY_FIND_BY_PERSONID= "UserAccount.findByPersonId";
		public static final String QUERY_FIND_BY_DOCUMENT= "UserAccount.findByDocument";
		public static final String QUERY_SEARCH_USERS= "UserAccount.findSearchUsers";
		public static final String UPDATE_BY_PERSONID = "UserAccoung.updateByPersonId";
		public static final String UPDATE_EMAIL_BY_ID = "UserAccoung.updateEmailById";
	}
	public static class SQLMascota{
		public static final String QUERY_FIND_BY_STATUS= "Mascota.findByStatus";
		public static final String QUERY_DELETE_BY_MASCOTA_PK= "Mascota.deleteByMascotaPk";
		
	}
	public static class SQLFuncion{
		public static final String QUERY_FIND_FUNCION_BY_OBRAID= "asaoiishda";
	}
	public static class SQLCliente{
		public static final String QUERY_FIND_BY_CLIENTE_BY_STATUS= "Cliente.getClienteByStatus";
		public static final String QUERY_DELETE_BY_CLIENTE_PK= "Cliente.deleteByClientePk";
		public static final String QUERY_FIND_BY_USUARIO_PK= "Cliente.getClienteByUsuarioPk";
	}
	public static class SQLUsuario{
		public static final String QUERY_FIND_USER_BY_DNI= "Usuario.getUsuarioByDni";
		public static final String QUERY_VERIFICA_USUARIO= "Usuario.verificaUsuario";
	}
	public static class SQLServicioMascota{
		public static final String QUERY_FIND_CONSULTA_ATENDIDO_DAY= "Servicio.FindServicio";
	}
	public static class SQLSHistorial{
		public static final String QUERY_FIND_SERVICIOMASCOTA_BY_USUARIOPK= "QUERY_FIND_SERVICIOMASCOTA_BY_USUARIOPK";
	}
}
