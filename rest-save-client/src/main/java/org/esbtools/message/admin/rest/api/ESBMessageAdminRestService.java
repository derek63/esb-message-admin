/*
 Copyright 2015 esbtools Contributors and/or its affiliates.

 This file is part of esbtools.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.esbtools.message.admin.rest.api;

import java.io.IOException;

import org.esbtools.message.admin.model.EsbMessage;

public interface ESBMessageAdminRestService {
    /**
     * Persists an ESB Error Message into the DB
     *
     * @param esbMessage The ESB error message data
     */
    void persistError(EsbMessage esbMessage) throws IOException;
}
