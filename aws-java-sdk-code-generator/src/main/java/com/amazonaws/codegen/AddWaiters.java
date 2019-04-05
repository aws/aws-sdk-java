/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen;

import com.amazonaws.codegen.model.intermediate.AcceptorModel;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.WaiterDefinitionModel;
import com.amazonaws.codegen.model.service.Acceptor;
import com.amazonaws.codegen.model.service.WaiterDefinition;
import com.amazonaws.codegen.model.service.Waiters;
import com.amazonaws.jmespath.JmesPathExpression;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.amazonaws.codegen.AstJsonToAstJava.fromAstJsonToAstJava;

class AddWaiters {

    private static final ObjectMapper mapper = new ObjectMapper();

    private final Waiters waiters;
    private final Map<String, OperationModel> operations;
    private final String codeGenBinDirectory;

    AddWaiters(Waiters waiters, Map<String, OperationModel> operations, String codeGenBinDirectory) {
        this.waiters = waiters;
        this.operations = operations;
        this.codeGenBinDirectory = codeGenBinDirectory;
    }

    Map<String, WaiterDefinitionModel> constructWaiters() throws IOException {


        Map<String, WaiterDefinitionModel> javaWaiterModels = new HashMap<>();
        Map<String, JmesPathExpression> argumentToAstMap = new HashMap<>();

        for (Map.Entry<String, WaiterDefinition> entry : waiters.getWaiters().entrySet()) {

            final String waiterName = entry.getKey();
            final WaiterDefinition waiterDefinition = entry.getValue();
            List<AcceptorModel> acceptors = new ArrayList<>();

            WaiterDefinitionModel waiterDefinitionModel = new WaiterDefinitionModel();

            waiterDefinitionModel.setDelay(waiterDefinition.getDelay());
            waiterDefinitionModel.setMaxAttempts(waiterDefinition.getMaxAttempts());
            waiterDefinitionModel.setWaiterName(waiterName);
            waiterDefinitionModel.setOperationModel(operations.get(waiterDefinition.getOperation()));
            for (Acceptor acceptor : waiterDefinition.getAcceptors()) {
                AcceptorModel acceptorModel = new AcceptorModel();
                acceptorModel.setMatcher(acceptor.getMatcher());
                acceptorModel.setState(acceptor.getState());
                acceptorModel.setExpected(acceptor.getExpected());
                acceptorModel.setArgument(acceptor.getArgument());
                acceptorModel.setAst(getAstFromArgument(acceptor.getArgument(), argumentToAstMap));

                acceptors.add(acceptorModel);
            }
            waiterDefinitionModel.setAcceptors(acceptors);
            javaWaiterModels.put(waiterName, waiterDefinitionModel);
        }

        return javaWaiterModels;
    }

    private JmesPathExpression getAstFromArgument(String argument, Map<String, JmesPathExpression> argumentToAstMap) throws
                                                                                                                            IOException {
        if (argument != null && !argumentToAstMap.containsKey(argument)) {

            final Process p = executeToAstProcess(argument);

            if(p.exitValue()!= 0) {
                throw new RuntimeException(IOUtils.toString(p.getErrorStream()));
            }

            JsonNode jsonNode = mapper.readTree(IOUtils.toString(p.getInputStream()));
            JmesPathExpression ast = fromAstJsonToAstJava(jsonNode);

            argumentToAstMap.put(argument, ast);
            IOUtils.closeQuietly(p.getInputStream(), null);

            return ast;

        } else if (argument != null) {
            return argumentToAstMap.get(argument);
        }
        return null;
    }

    /**
     * Execute the jp-to-ast.py command and wait for it to complete.
     *
     * @param argument JP expression to compile to AST.
     * @return Process with access to output streams.
     */
    private Process executeToAstProcess(String argument) throws IOException {
        try {
            Process p = new ProcessBuilder("python", codeGenBinDirectory + "/jp-to-ast.py", argument).start();
            p.waitFor();
            return p;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
