/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.auth.policy.Action;
import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.Policy;
import com.amazonaws.auth.policy.Principal;
import com.amazonaws.auth.policy.Principal.Services;
import com.amazonaws.auth.policy.Principal.WebIdentityProviders;
import com.amazonaws.auth.policy.Resource;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.auth.policy.Statement.Effect;
import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;

/**
 * Generate an AWS policy object from a JSON string.
 */
public class JsonPolicyReader {

    /**
     * Converts the specified JSON string to an AWS policy object.
     *
     * @param jsonString
     *            the specified JSON string representation of this AWS access
     *            control policy.
     *
     * @return An AWS policy object.
     *
     * @throws IllegalArgumentException
     *             If the specified JSON string is null or invalid and cannot be
     *             converted to an AWS policy object.
     */
    public Policy createPolicyFromJsonString(String jsonString)  {

        if (jsonString == null) {
            throw new IllegalArgumentException("JSON string cannot be null");
        }

        Policy policy = new Policy();
        List<Statement> statements = new LinkedList<Statement>();
        try {
            JSONObject jPolicy = new JSONObject(jsonString);

            if (Arrays.asList(JSONObject.getNames(jPolicy)).contains(JsonDocumentFields.POLICY_ID)) {
                policy.setId(jPolicy.getString(JsonDocumentFields.POLICY_ID));
            }

            JSONArray jStatements = jPolicy.getJSONArray(JsonDocumentFields.STATEMENT);

            for (int index = 0 ; index < jStatements.length() ; index++) {
                Statement statement = convertStatement(jStatements.getJSONObject(index));
                if (statement != null) {
                statements.add(statement);
                }
            }
        } catch (Exception e) {
            String message = "Unable to generate policy object fron JSON string " + e.getMessage();
            throw new IllegalArgumentException(message, e);
        }
        policy.setStatements(statements);
        return policy;
    }

    private  Statement convertStatement(JSONObject jStatement) throws JSONException {
        if (!Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.STATEMENT_EFFECT)) {
            return null;
        }

        Statement statement;
        String jEffect = jStatement.getString(JsonDocumentFields.STATEMENT_EFFECT);
        if (JsonDocumentFields.EFFECT_VALUE_ALLOW.equals(jEffect)) {
            statement = new Statement(Effect.Allow);
        } else {
            statement = new Statement(Effect.Deny);
        }

        if (Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.STATEMENT_ID)) {
            statement.setId(jStatement.getString(JsonDocumentFields.STATEMENT_ID));
        }

        convertActions(statement, jStatement);
        convertResources(statement, jStatement);
        convertCondition(statement, jStatement);
        convertPrincipals(statement, jStatement);
        return statement;
    }

    private  void convertPrincipals(Statement statement, JSONObject jStatement) throws JSONException {
        if (!Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.PRINCIPAL)) {
            return;
        }

        if (jStatement.optString(JsonDocumentFields.PRINCIPAL).equals("*")) {
            statement.setPrincipals(Principal.All);
            return;
        }

        if (statement.getPrincipals() == null) {
            statement.setPrincipals(new LinkedList<Principal>());
        }

        JSONObject jPrincipals = jStatement.getJSONObject(JsonDocumentFields.PRINCIPAL);
        String[] fields = JSONObject.getNames(jPrincipals);
        for (String field : fields) {
            String serviceId = jPrincipals.optString(field);
            if (serviceId != null && serviceId.length() > 0) {
                if (field.equalsIgnoreCase("AWS")) {
                    statement.getPrincipals().add(new Principal(serviceId));
                } else if (field.equalsIgnoreCase("Service")) {
                    statement.getPrincipals().add(
                            new Principal(Services.fromString(serviceId)));
                } else if (field.equalsIgnoreCase("Federated")) {
                    statement.getPrincipals().add(
                            new Principal(WebIdentityProviders.fromString(serviceId)));
                }
            } else {
                JSONArray jPrincipal = jPrincipals.getJSONArray(field);
                convertPrincipalRecord(field, statement, jPrincipal);
            }
        }
    }

    private void convertPrincipalRecord(String schema, Statement statement, JSONArray jPrincipal) throws JSONException {
        Principal principal = null;
        for (int index = 0 ; index < jPrincipal.length() ; index++) {
            if (schema.equals("AWS")) {
                if (jPrincipal.getString(index).equals("*")) {
                    principal = Principal.AllUsers;
                }
                principal = new Principal(jPrincipal.getString(index));
            } else if (schema.equals("Service")) {
                principal = new Principal(Services.fromString(jPrincipal.getString(index)));
            }
            statement.getPrincipals().add(principal);
        }
    }

    private void convertCondition(Statement statement, JSONObject jStatement) throws JSONException {
        if (!Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.CONDITION)) {
            return;
        }
        JSONObject jConditions = jStatement.getJSONObject(JsonDocumentFields.CONDITION);
        List<Condition> conditions = new LinkedList<Condition>();
        String[] types = JSONObject.getNames(jConditions);
        for (String type : types) {
             JSONObject jCondition = jConditions.getJSONObject(type);
             convertConditionRecord(conditions, type, jCondition);
        }
        statement.setConditions(conditions);
    }

    private void convertConditionRecord(List<Condition> conditions, String type, JSONObject jCondition) throws JSONException {
        List<String> values = new LinkedList<String>();
        String[] keys = JSONObject.getNames(jCondition);
        for (String key : keys) {
            String value = jCondition.optString(key);
            if (value != null && value.length() > 0) {
                values.add(value);
            } else {
                JSONArray jValues = jCondition.getJSONArray(key);
                for (int index = 0; index < jValues.length(); index++) {
                    values.add(jValues.getString(index));
                }
            }
            conditions.add(new Condition().withType(type).withConditionKey(key).withValues(values));
        }
    }

    private void convertActions(Statement statement, JSONObject jStatement) throws JSONException {
        if (!Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.ACTION)) {
            return;
        }

        String actionName = null;
        List<Action> actions = new LinkedList<Action>();

        actionName = jStatement.optString(JsonDocumentFields.ACTION);
        if (actionName != null && actionName.length() > 0) {
            actions.add(new NamedAction(actionName));
            statement.setActions(actions);
            return;
        }

        JSONArray jActions = jStatement.getJSONArray(JsonDocumentFields.ACTION);
        for (int index = 0 ; index < jActions.length() ; index++) {
            actionName = jActions.getString(index);
            actions.add(new NamedAction(actionName));
        }
        statement.setActions(actions);
    }

    private void convertResources(Statement statement, JSONObject jStatement) throws JSONException {
        if (!Arrays.asList(JSONObject.getNames(jStatement)).contains(JsonDocumentFields.RESOURCE)) {
            return;
        }

        List<Resource> resources = new LinkedList<Resource>();
        String resourceId = jStatement.optString(JsonDocumentFields.RESOURCE);
        if (resourceId != null && resourceId.length() > 0) {
            resources.add(new Resource(resourceId));
            statement.setResources(resources);
            return;
        }

        JSONArray jResources = jStatement.getJSONArray(JsonDocumentFields.RESOURCE);
        for (int index = 0 ; index < jResources.length() ; index++) {
            resources.add(new Resource(jResources.getString(index)));
        }
        statement.setResources(resources);
    }

    /**
     *  An auxiliary class to help instantiate the action object.
     */
    private static class NamedAction implements Action {

        private String actionName;

        public NamedAction(String actionName) {
            this.actionName = actionName;
        }

        public String getActionName() {
             return actionName;
        }

    }

}
