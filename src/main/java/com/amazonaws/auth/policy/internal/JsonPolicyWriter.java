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

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.auth.policy.Action;
import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.Policy;
import com.amazonaws.auth.policy.Principal;
import com.amazonaws.auth.policy.Resource;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONWriter;

/**
 * Serializes an AWS policy object to a JSON string, suitable for sending to an
 * AWS service.
 */
public class JsonPolicyWriter {

    /**
     * Converts the specified AWS policy object to a JSON string, suitable for
     * passing to an AWS service.
     *
     * @param policy
     *            The AWS policy object to convert to a JSON string.
     *
     * @return The JSON string representation of the specified policy object.
     *
     * @throws IllegalArgumentException
     *             If the specified policy is null or invalid and cannot be
     *             serialized to a JSON string.
     */
    public String writePolicyToString(Policy policy) {
        if (policy == null) {
            throw new IllegalArgumentException("Policy cannot be null");
        }

        StringWriter writer = new StringWriter();
        try {
            JSONWriter generator = new JSONWriter(writer);
            writePolicy(policy, generator);
            return writer.toString();
        } catch (Exception e) {
            String message = "Unable to serialize policy to JSON string: " + e.getMessage();
            throw new IllegalArgumentException(message, e);
        } finally {
            try {writer.close();} catch (Exception e) {}
        }
    }

    private void writePolicy(Policy policy, JSONWriter generator)
            throws JSONException, IOException {
        generator.object();
        generator.key("Version").value(policy.getVersion());

        if (policy.getId() != null) {
            generator.key("Id").value(policy.getId());
        }

        generator.key("Statement").array();
        for (Statement statement : policy.getStatements()) {
            generator.object();
            if (statement.getId() != null) {
                generator.key("Sid").value(statement.getId());
            }
            generator.key("Effect").value(statement.getEffect().toString());

            writePrincipals(statement, generator);
            writeActions(statement, generator);
            writeResources(statement, generator);
            writeConditions(statement, generator);

            generator.endObject();
        }
        generator.endArray();

        generator.endObject();
    }

    private void writeConditions(Statement statement, JSONWriter generator)
            throws IOException, JSONException {
        List<Condition> conditions = statement.getConditions();
        if (conditions == null || conditions.isEmpty()) return;

        /*
         * We could have multiple conditions that are the same condition type
         * but use different condition keys. In JSON and XML, those conditions
         * must be siblings, otherwise data can be lost when they get parsed.
         */
        Map<String, List<Condition>> conditionsByType =
            sortConditionsByType(conditions);

        generator.key("Condition").object();
        for (Map.Entry<String, List<Condition>> entry
                 : conditionsByType.entrySet()) {

            String conditionType = entry.getKey();
            generator.key(conditionType).object();

            writeConditions(entry.getValue(), generator);

            generator.endObject();

        }
        generator.endObject();
    }

    private void writeConditions(final List<Condition> conditions,
                                 final JSONWriter generator)
            throws IOException, JSONException {

        /*
         * We could also have multiple conditions that use the same type and
         * same key, in which case, we need to push them together as one entry
         * when we send the JSON representation.
         */
        Map<String, List<String>> conditionValuesByKey =
            sortConditionsByKey(conditions);

        for (Map.Entry<String, List<String>> entry
                 : conditionValuesByKey.entrySet()) {

            String conditionKey = entry.getKey();
            generator.key(conditionKey).array();

            for (String value : entry.getValue()) {
                generator.value(value);
            }

            generator.endArray();
        }
    }

    private Map<String, List<String>> sortConditionsByKey(List<Condition> conditions) {
        Map<String, List<String>> conditionValuesByConditionKey = new HashMap<String, List<String>>();

        for (Condition condition : conditions) {
            String key = condition.getConditionKey();
            List<String> values = condition.getValues();

            if (conditionValuesByConditionKey.containsKey(key) == false) {
                conditionValuesByConditionKey.put(key, new ArrayList<String>());
            }
            conditionValuesByConditionKey.get(key).addAll(values);
        }

        return conditionValuesByConditionKey;
    }

    private Map<String, List<Condition>> sortConditionsByType(List<Condition> conditions) {
        Map<String, List<Condition>> conditionsByType = new HashMap<String, List<Condition>>();
        for (Condition condition : conditions) {
            String conditionType = condition.getType();
            if (conditionsByType.get(conditionType) == null) {
                conditionsByType.put(conditionType, new ArrayList<Condition>());
            }
            conditionsByType.get(conditionType).add(condition);
        }

        return conditionsByType;
    }

    private void writeResources(Statement statement, JSONWriter generator)
            throws IOException, JSONException {
        List<Resource> resources = statement.getResources();
        if (resources == null || resources.isEmpty()) return;

        generator.key("Resource").array();
        for (Resource resource : resources) {
            generator.value(resource.getId());
        }
        generator.endArray();
    }

    private void writeActions(Statement statement, JSONWriter generator)
            throws IOException, JSONException {
        List<Action> actions = statement.getActions();
        if (actions == null || actions.isEmpty()) return;

        generator.key("Action").array();
        for (Action action : actions) {
            generator.value(action.getActionName());
        }
        generator.endArray();
    }

    /**
     * Uses the specified generator to write the JSON data for the principals in
     * the specified policy statement.
     */
    private void writePrincipals(Statement statement, JSONWriter generator)
            throws IOException, JSONException {

        boolean allAccessPrincipal = false;
        boolean allUserAccessPrincipal = false;
        boolean allServiceAccessPrincipal = false;
        boolean allFederatedAccessPrincipal = false;
        List<Principal> principals = statement.getPrincipals();
        if (principals == null || principals.isEmpty()) return;



        Map<String, List<String>> principalContentsByScheme =
            new HashMap<String, List<String>>();

        for (Principal p : principals) {
            if (p.equals(Principal.All)) {
                allAccessPrincipal = true;
            }

            if (p.equals(Principal.AllUsers)) {
                allUserAccessPrincipal = true;
            }

            if (p.equals(Principal.AllServices)) {
                allServiceAccessPrincipal = true;
            }

            if (p.equals(Principal.AllWebProviders)) {
                allFederatedAccessPrincipal = true;
            }

            List<String> principalValues =
                principalContentsByScheme.get(p.getProvider());

            if (principalValues == null) {
                principalValues = new ArrayList<String>();
                principalContentsByScheme.put(p.getProvider(),
                                              principalValues);
            }

            principalValues.add(p.getId());
        }

        if (allAccessPrincipal == true) {
            generator.key("Principal");
            generator.value("*");
            return;
        }

        generator.key("Principal").object();
        if (allUserAccessPrincipal == true) {
            principalContentsByScheme.remove("AWS");
            generator.key("AWS").value("*");
        }

        if (allServiceAccessPrincipal == true) {
            principalContentsByScheme.remove("Service");
            generator.key("Service");
            generator.value("*");
        }

        if (allFederatedAccessPrincipal == true) {
            principalContentsByScheme.remove("Federated");
            generator.key("Federated");
            generator.value("*");
        }

        for (Map.Entry<String, List<String>> entry
                 : principalContentsByScheme.entrySet()) {

            String scheme = entry.getKey();
            generator.key(scheme).array();

            for (String principalId : entry.getValue()) {
                generator.value(principalId);
            }

            generator.endArray();
        }

        generator.endObject();
    }
}
