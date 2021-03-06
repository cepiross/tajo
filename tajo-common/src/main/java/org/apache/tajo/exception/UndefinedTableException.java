/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tajo.exception;


import org.apache.tajo.error.Errors.ResultCode;
import org.apache.tajo.rpc.protocolrecords.PrimitiveProtos.ReturnState;

public class UndefinedTableException extends TajoException {
	private static final long serialVersionUID = 277182608283894937L;

  public UndefinedTableException(ReturnState state) {
    super(state);
  }

  public UndefinedTableException(String dbName, String tbName) {
		super(ResultCode.UNDEFINED_TABLE, dbName + "." + tbName);
  }

	public UndefinedTableException(String relName) {
		super(ResultCode.UNDEFINED_TABLE, relName);
	}
}
