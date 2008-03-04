/*
 * Copyright 2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.wsdl.wsdl11.visitor;

import javax.wsdl.Binding;
import javax.wsdl.BindingFault;
import javax.wsdl.BindingInput;
import javax.wsdl.BindingOperation;
import javax.wsdl.BindingOutput;
import javax.wsdl.WSDLException;

/**
 * @author Arjen Poutsma
 * @since 1.5.0
 */
public interface BindingVisitor {

    void startBinding(Binding binding) throws WSDLException;

    void startBindingOperation(BindingOperation operation) throws WSDLException;

    void bindingInput(BindingInput input) throws WSDLException;

    void bindingOutput(BindingOutput output) throws WSDLException;

    void bindingFault(BindingFault fault) throws WSDLException;

    void endBindingOperation(BindingOperation operation) throws WSDLException;

    void endBinding(Binding binding) throws WSDLException;

}