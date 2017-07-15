/*
 *
 *   Copyright 2017 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.powermock.api.mockito.invocation;

import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationContainer;
import org.mockito.invocation.MockHandler;
import org.mockito.stubbing.Answer;
import org.powermock.reflect.Whitebox;

import java.util.List;

/**
 * The class provides a access to method and data of  {@link org.mockito.invocation.MockHandler} from the given mock instance.
 */
public class MockHandlerAccessor<T> {
    private final T mockInstance;
    
    public MockHandlerAccessor(final T mockInstance) {
        this.mockInstance = mockInstance;
    }
    
    public MockHandler<T> getMockHandler(){
        return MockUtil.getMockHandler(mockInstance);
    }
    
    public void setAnswersForStubbing(final List<Answer<?>> answers) {
        InvocationContainer invocationContainer = getMockHandler().getInvocationContainer();
        try {
            Whitebox.invokeMethod(invocationContainer, "setAnswersForStubbing", answers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public InvocationContainer getInvocationContainer() {
        return getMockHandler().getInvocationContainer();
    }
    
    public Object handle(final Invocation invocation) throws Throwable {
        return getMockHandler().handle(invocation);
    }
}
