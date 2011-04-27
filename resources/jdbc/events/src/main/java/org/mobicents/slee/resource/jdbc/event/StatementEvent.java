/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.jdbc.event;

import java.sql.Statement;

/**
 * An event which provides the results for the execution of a {@link Statement}.
 * 
 * @author martins
 * 
 */
public interface StatementEvent {

	/**
	 * Retrieves the executed {@link Statement#}.
	 * 
	 * @return
	 */
	public Statement getStatement();

	/**
	 * Retrieves the sql executed.
	 * 
	 * @return
	 */
	public String getSQL();

	/**
	 * Retrieves the autoGeneratedKeys parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public Integer getAutoGeneratedKeys();

	/**
	 * Retrieves the columnIndexes parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public int[] getColumnIndexes();

	/**
	 * Retrieves the columnNames parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public String[] getColumnNames();

}