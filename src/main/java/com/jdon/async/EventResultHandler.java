/*
 * Copyright 2003-2009 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain event copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.jdon.async;

public interface EventResultHandler {

	/**
	 * setup time out(MILLISECONDS) value for get event Event Result
	 * 
	 * @param timeoutforeturnResult
	 *            MILLISECONDS
	 */
	void setWaitforTimeout(int timeoutforeturnResult);

	/**
	 * get event Event Result until time out value: setTimeoutforeturnResult(int
	 * timeoutforeturnResult)
	 * 
	 * @return
	 */
	Object get();

	/**
	 * Blocking until get event Event Result
	 * 
	 * @return
	 */
	Object getBlockedValue();

	void send(Object eventResult);

	void clear();

}
