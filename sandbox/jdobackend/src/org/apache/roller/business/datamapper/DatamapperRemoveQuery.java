/*
 * Copyright 2006 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package org.apache.roller.business.datamapper;

import java.util.List;

/**
 *
 */
public interface DatamapperRemoveQuery {

    /**
     * Remove instances selected by the query with no parameters.
     */
    void removeAll();

    /** Remove instances selected by the query with one parameter.
     * @param param the parameter
     */
    void removeAll(Object param);

    /** Remove instances selected by the query with parameters.
     * @param params the parameters
     */
    void removeAll(Object[] params);

    /** Set the result to be a single instance (not a List).
     * @return the instance on which this method is called
     */
    DatamapperRemoveQuery setUnique();

    /** Set the types of the parameters. This is only needed if the 
     * parameter types are temporal types, e.g. Date, Time, Calendar.
     * @param types types of the parameters in corresponding positions.
     * @return the instance on which this method is called
     */
    DatamapperRemoveQuery setTypes(Object[] types);

}
