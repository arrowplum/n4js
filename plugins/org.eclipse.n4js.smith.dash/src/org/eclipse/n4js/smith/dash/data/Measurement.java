/**
 * Copyright (c) 2017 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.smith.dash.data;

/**
 * Generic interface for measurements. Obtained instance should be considered {@code started}. Caller can end given
 * measurement by calling {@link #end()}. Concrete implementations will track different data.
 */
public interface Measurement {

	/**
	 * Ends given measurement. Concrete implementations can do some data processing in this step. It is expected that
	 * caller invokes this only once, but concrete implementations need to assure that this method is safe to call
	 * multiple times, i.e. subsequent calls have no effects.
	 */
	public void end();

}
