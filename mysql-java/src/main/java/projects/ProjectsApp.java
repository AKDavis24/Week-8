/**
 * 
 */
package projects;

import projects.dao.DbConnection;
import projects.exception.DbException;

/**
 * 
 */
public class ProjectsApp {

	/**
	 * @param args
	 * @throws DbException 
	 */
	public static void main(String[] args){
		DbConnection.getConnection();
	}

}
