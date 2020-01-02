/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Statement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementJsonUnmarshaller implements Unmarshaller<Statement, JsonUnmarshallerContext> {

    public Statement unmarshall(JsonUnmarshallerContext context) throws Exception {
        Statement statement = new Statement();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ByteMatchStatement", targetDepth)) {
                    context.nextToken();
                    statement.setByteMatchStatement(ByteMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SqliMatchStatement", targetDepth)) {
                    context.nextToken();
                    statement.setSqliMatchStatement(SqliMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XssMatchStatement", targetDepth)) {
                    context.nextToken();
                    statement.setXssMatchStatement(XssMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizeConstraintStatement", targetDepth)) {
                    context.nextToken();
                    statement.setSizeConstraintStatement(SizeConstraintStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeoMatchStatement", targetDepth)) {
                    context.nextToken();
                    statement.setGeoMatchStatement(GeoMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuleGroupReferenceStatement", targetDepth)) {
                    context.nextToken();
                    statement.setRuleGroupReferenceStatement(RuleGroupReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IPSetReferenceStatement", targetDepth)) {
                    context.nextToken();
                    statement.setIPSetReferenceStatement(IPSetReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegexPatternSetReferenceStatement", targetDepth)) {
                    context.nextToken();
                    statement.setRegexPatternSetReferenceStatement(RegexPatternSetReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RateBasedStatement", targetDepth)) {
                    context.nextToken();
                    statement.setRateBasedStatement(RateBasedStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AndStatement", targetDepth)) {
                    context.nextToken();
                    statement.setAndStatement(AndStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OrStatement", targetDepth)) {
                    context.nextToken();
                    statement.setOrStatement(OrStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotStatement", targetDepth)) {
                    context.nextToken();
                    statement.setNotStatement(NotStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManagedRuleGroupStatement", targetDepth)) {
                    context.nextToken();
                    statement.setManagedRuleGroupStatement(ManagedRuleGroupStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return statement;
    }

    private static StatementJsonUnmarshaller instance;

    public static StatementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StatementJsonUnmarshaller();
        return instance;
    }
}
