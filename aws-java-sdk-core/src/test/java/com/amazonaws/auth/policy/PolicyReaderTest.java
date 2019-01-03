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
package com.amazonaws.auth.policy;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.amazonaws.auth.policy.Principal.Services;
import com.amazonaws.auth.policy.Statement.Effect;
import com.amazonaws.auth.policy.conditions.ConditionFactory;
import com.amazonaws.auth.policy.conditions.IpAddressCondition;
import com.amazonaws.auth.policy.conditions.IpAddressCondition.IpAddressComparisonType;
import com.amazonaws.auth.policy.conditions.StringCondition;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;


/**
 * Unit tests for generating AWS policy object from JSON string.
 */
public class PolicyReaderTest {

    final String POLICY_VERSION = "2012-10-17";

    @Test
    public void testPrincipals() {
        Policy policy = new Policy();
        policy.withStatements(new Statement(Effect.Allow)
          .withResources(new Resource("resource"))
          .withPrincipals(new Principal("accountId1"), new Principal("accountId2"))
          .withActions(new TestAction("action")));

        policy = Policy.fromJson(policy.toJson());
        assertEquals(1, policy.getStatements().size());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("action", statements.get(0).getActions().get(0).getActionName());
        assertEquals("resource", statements.get(0).getResources().get(0).getId());
        assertEquals(2, statements.get(0).getPrincipals().size());
        assertEquals("AWS", statements.get(0).getPrincipals().get(0).getProvider());
        assertEquals("accountId1", statements.get(0).getPrincipals().get(0).getId());
        assertEquals("AWS", statements.get(0).getPrincipals().get(1).getProvider());
        assertEquals("accountId2", statements.get(0).getPrincipals().get(1).getId());

        policy = new Policy();
        policy.withStatements(new Statement(Effect.Allow).withResources(new Resource("resource")).withPrincipals(new Principal(Services.AmazonEC2), new Principal(Services.AmazonElasticTranscoder))
                .withActions(new TestAction("action")));
        policy = Policy.fromJson(policy.toJson());
        assertEquals(1, policy.getStatements().size());
        statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("action", statements.get(0).getActions().get(0).getActionName());
        assertEquals(2, statements.get(0).getPrincipals().size());
        assertEquals("Service", statements.get(0).getPrincipals().get(0).getProvider());
        assertEquals(Services.AmazonEC2.getServiceId(), statements.get(0).getPrincipals().get(0).getId());
        assertEquals("Service", statements.get(0).getPrincipals().get(1).getProvider());
        assertEquals(Services.AmazonElasticTranscoder.getServiceId(), statements.get(0).getPrincipals().get(1).getId());

        policy = new Policy();
        policy.withStatements(new Statement(Effect.Allow).withResources(new Resource("resource")).withPrincipals(Principal.All)
                .withActions(new TestAction("action")));
        policy = Policy.fromJson(policy.toJson());
        assertEquals(1, policy.getStatements().size());
        statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("action", statements.get(0).getActions().get(0).getActionName());
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals(Principal.All, statements.get(0).getPrincipals().get(0));


        policy = new Policy();
        policy.withStatements(new Statement(Effect.Allow).withResources(new Resource("resource")).withPrincipals(Principal.AllUsers, Principal.AllServices, Principal.AllWebProviders)
                .withActions(new TestAction("action")));
        policy = Policy.fromJson(policy.toJson());
        assertEquals(1, policy.getStatements().size());
        statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("action", statements.get(0).getActions().get(0).getActionName());
        assertEquals(3, statements.get(0).getPrincipals().size());
        assertThat(statements.get(0).getPrincipals(),
                contains(Principal.AllUsers, Principal.AllServices, Principal.AllWebProviders));
    }

    @Test
    public void testMultipleConditionKeysForConditionType() throws Exception {
        Policy policy = new Policy();
        policy.withStatements(new Statement(Effect.Allow)
          .withResources(new Resource("arn:aws:sqs:us-east-1:987654321000:MyQueue"))
          .withPrincipals(Principal.AllUsers)
          .withActions(new TestAction("foo"))
          .withConditions(
                new StringCondition(StringComparisonType.StringNotLike, "key1", "foo"),
                new StringCondition(StringComparisonType.StringNotLike, "key1", "bar")));

        policy = Policy.fromJson(policy.toJson());

        assertEquals(1, policy.getStatements().size());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("foo", statements.get(0).getActions().get(0).getActionName());
        assertEquals(1, statements.get(0).getConditions().size());
        assertEquals("StringNotLike", statements.get(0).getConditions().get(0).getType());
        assertEquals("key1", statements.get(0).getConditions().get(0).getConditionKey());
        assertEquals(2, statements.get(0).getConditions().get(0).getValues().size());
        assertEquals("foo", statements.get(0).getConditions().get(0).getValues().get(0));
        assertEquals("bar", statements.get(0).getConditions().get(0).getValues().get(1));
    }

    /**
     * Test policy parsing when the "Effect" is not mentioned in a Statement.
     * The Effect must be default to "Deny" when it is not mentioned.
     */
    @Test
    public void testPolicyParsingWithNoEffect() {
        String jsonString =
               "{" +
                   "\"Statement\": [{" +
                        "\"Action\": [" +
                            "\"elasticmapreduce:*\"," +
                            "\"iam:PassRole\"" +
                        "]," +
                        "\"Resource\": [\"*\"]" +
                   "}]" +
               "}";

        Policy policy = Policy.fromJson(jsonString);
        assertEquals(1, policy.getStatements().size());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Deny, statements.get(0).getEffect());
        assertEquals(1, statements.size());
    }

    @Test
    public void testMultipleStatements() throws Exception {
         Policy policy = new Policy("S3PolicyId1");
            policy.withStatements(
                    new Statement(Effect.Allow)
                        .withId("0")
                        .withPrincipals(Principal.AllUsers)
                        .withActions(new TestAction("action1"))
                        .withResources(new Resource("resource"))
                        .withConditions(
                                new IpAddressCondition("192.168.143.0/24"),
                                new IpAddressCondition(IpAddressComparisonType.NotIpAddress, "192.168.143.188/32")),
                    new Statement(Effect.Deny)
                        .withId("1")
                        .withPrincipals(Principal.AllUsers)
                        .withActions(new TestAction("action2"))
                        .withResources(new Resource("resource"))
                        .withConditions(new IpAddressCondition("10.1.2.0/24")));

        policy = Policy.fromJson(policy.toJson());

        assertEquals(2, policy.getStatements().size());
        assertEquals("S3PolicyId1", policy.getId());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());

        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("0", statements.get(0).getId());
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals("*", statements.get(0).getPrincipals().get(0).getId());
        assertEquals("AWS", statements.get(0).getPrincipals().get(0).getProvider());
        assertEquals(1, statements.get(0).getResources().size());
        assertEquals("resource", statements.get(0).getResources().get(0).getId());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("action1", statements.get(0).getActions().get(0).getActionName());
        assertEquals(2, statements.get(0).getConditions().size());
        assertEquals("IpAddress", statements.get(0).getConditions().get(0).getType());
        assertEquals(ConditionFactory.SOURCE_IP_CONDITION_KEY, statements.get(0).getConditions().get(0).getConditionKey());
        assertEquals(1, statements.get(0).getConditions().get(0).getValues().size());
        assertEquals("192.168.143.0/24", statements.get(0).getConditions().get(0).getValues().get(0));
        assertEquals("NotIpAddress", statements.get(0).getConditions().get(1).getType());
        assertEquals(1, statements.get(0).getConditions().get(1).getValues().size());
        assertEquals("192.168.143.188/32", statements.get(0).getConditions().get(1).getValues().get(0));

        assertEquals(ConditionFactory.SOURCE_IP_CONDITION_KEY, statements.get(1).getConditions().get(0).getConditionKey());
        assertEquals(Effect.Deny, statements.get(1).getEffect());
        assertEquals("1", statements.get(1).getId());
        assertEquals(1, statements.get(1).getPrincipals().size());
        assertEquals("*", statements.get(1).getPrincipals().get(0).getId());
        assertEquals("AWS", statements.get(1).getPrincipals().get(0).getProvider());
        assertEquals(1, statements.get(1).getResources().size());
        assertEquals("resource", statements.get(1).getResources().get(0).getId());
        assertEquals(1, statements.get(1).getActions().size());
        assertEquals("action2", statements.get(1).getActions().get(0).getActionName());
        assertEquals(1, statements.get(1).getConditions().size());
        assertEquals("IpAddress", statements.get(1).getConditions().get(0).getType());
        assertEquals(ConditionFactory.SOURCE_IP_CONDITION_KEY, statements.get(0).getConditions().get(0).getConditionKey());
        assertEquals(1, statements.get(0).getConditions().get(0).getValues().size());
        assertEquals("10.1.2.0/24", statements.get(1).getConditions().get(0).getValues().get(0));
    }

    @Test
    public void testNoJsonArray() {
        String jsonString =
                  "{" +
                    "\"Version\": \"2012-10-17\"," +
                    "\"Statement\": [" +
                      "{" +
                        "\"Effect\": \"Allow\"," +
                        "\"Principal\": {" +
                        "\"AWS\": \"*\"" +
                        "}," +
                        "\"Action\": \"sts:AssumeRole\"," +
                        "\"Condition\": {" +
                          "\"IpAddress\": {" +
                            " \"aws:SourceIp\": \"10.10.10.10/32\"" +
                          "}" +
                        "}" +
                      "}" +
                    "]" +
                 "}" ;

        Policy policy = Policy.fromJson(jsonString);
        assertEquals(POLICY_VERSION, policy.getVersion());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());
        assertEquals(1, statements.size());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("sts:AssumeRole", statements.get(0).getActions().get(0).getActionName());
        assertEquals(1, statements.get(0).getConditions().size());
        assertEquals("IpAddress", statements.get(0).getConditions().get(0).getType());
        assertEquals("aws:SourceIp", statements.get(0).getConditions().get(0).getConditionKey());
        assertEquals(1, statements.get(0).getConditions().get(0).getValues().size());
        assertEquals("10.10.10.10/32", statements.get(0).getConditions().get(0).getValues().get(0));
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals("*", statements.get(0).getPrincipals().get(0).getId());
        assertEquals("AWS", statements.get(0).getPrincipals().get(0).getProvider());

    }

    @Test
    public void testNoStatementArray() {
        String policy = "{\n" +
                        "  \"Version\": \"2012-10-17\",\n" +
                        "  \"Statement\": {\n" +
                        "    \"Effect\": \"Allow\",\n" +
                        "    \"Action\": [\n" +
                        "      \"acm:DescribeCertificate\"" +
                        "    ],\n" +
                        "    \"Resource\": \"*\"\n" +
                        "  }\n" +
                        "}";

        Policy p = Policy.fromJson(policy);
        assertEquals(POLICY_VERSION, p.getVersion());

        List<Statement> statements = new LinkedList<Statement>(p.getStatements());

        assertEquals(1, statements.size());
        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals("acm:DescribeCertificate", statements.get(0).getActions().get(0).getActionName());
        assertEquals("*", statements.get(0).getResources().get(0).getId());

    }

    /**
     * Tests that SAML-based federated user is supported as principal.
     */
    @Test
    public void testFederatedUserBySAMLProvider() {
        String jsonString =
            "{" +
                "\"Version\":\"2012-10-17\"," +
                "\"Statement\":[" +
                   "{" +
                      "\"Sid\":\"\"," +
                      "\"Effect\":\"Allow\"," +
                      "\"Principal\":{" +
                         "\"Federated\":\"arn:aws:iam::862954416975:saml-provider/myprovider\"" +
                      "}," +
                      "\"Action\":\"sts:AssumeRoleWithSAML\"," +
                      "\"Condition\":{" +
                         "\"StringEquals\":{" +
                            "\"SAML:aud\":\"https://signin.aws.amazon.com/saml\"" +
                         "}" +
                      "}" +
                   "}" +
                "]" +
             "}";

        Policy policy = Policy.fromJson(jsonString);
        assertEquals(POLICY_VERSION, policy.getVersion());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());
        assertEquals(1, statements.size());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("sts:AssumeRoleWithSAML", statements.get(0).getActions().get(0).getActionName());
        assertEquals(1, statements.get(0).getConditions().size());
        assertEquals("StringEquals", statements.get(0).getConditions().get(0).getType());
        assertEquals("SAML:aud", statements.get(0).getConditions().get(0).getConditionKey());
        assertEquals(1, statements.get(0).getConditions().get(0).getValues().size());
        assertEquals("https://signin.aws.amazon.com/saml", statements.get(0).getConditions().get(0).getValues().get(0));
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals("arn:aws:iam::862954416975:saml-provider/myprovider", statements.get(0).getPrincipals().get(0).getId());
        assertEquals("Federated", statements.get(0).getPrincipals().get(0).getProvider());
    }

    @Test
    public void testCloudHSMServicePrincipal() {
        String jsonString =
            "{" +
                "\"Version\":\"2008-10-17\"," +
                "\"Statement\":[" +
                "{\"Sid\":\"\"," +
                "\"Effect\":\"Allow\"," +
                "\"Principal\":{\"Service\":\"cloudhsm.amazonaws.com\"}," +
                "\"Action\":\"sts:AssumeRole\"}" +
                "]" +
            "}";
        Policy policy = Policy.fromJson(jsonString);
        assertEquals(POLICY_VERSION, policy.getVersion());
        List<Statement> statements = new LinkedList<Statement>(policy.getStatements());
        assertEquals(1, statements.size());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("sts:AssumeRole", statements.get(0).getActions().get(0).getActionName());
        assertEquals(0, statements.get(0).getConditions().size());
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals(Services.AWSCloudHSM.getServiceId(), statements.get(0).getPrincipals().get(0).getId());
        assertEquals("Service", statements.get(0).getPrincipals().get(0).getProvider());
    }

    private class TestAction implements Action {
        private final String name;

        public TestAction(String name) {
            this.name = name;
        }

        public String getActionName() {
            return name;
        }
    }


    /**
     * This test case was written as result of the following TT
     *
     * @see TT:0030871921
     *
     *      When a service is mentioned in the principal, we always try to
     *      figure out the service from
     *      <code>com.amazonaws.auth.policy.Principal.Services</code> enum. For
     *      new services introduced, if the enum is not updated, then the parsing
     *      fails.
     */
    @Test
    public void testPrincipalWithServiceNotInServicesEnum() {
        String jsonString = "{" + "\"Version\":\"2008-10-17\","
                + "\"Statement\":[" + "{" + "\"Sid\":\"\","
                + "\"Effect\":\"Allow\"," + "\"Principal\":{"
                + "\"Service\":\"workspaces.amazonaws.com\" " + "},"
                + "\"Action\":\"sts:AssumeRole\"" + "}" + "]" + "}";

        Policy policy = Policy.fromJson(jsonString);
        assertEquals(POLICY_VERSION, policy.getVersion());
        List<Statement> statements = new LinkedList<Statement>(
                policy.getStatements());
        assertEquals(1, statements.size());
        assertEquals(1, statements.get(0).getActions().size());
        assertEquals(Effect.Allow, statements.get(0).getEffect());
        assertEquals("sts:AssumeRole", statements.get(0).getActions().get(0)
                .getActionName());
        assertEquals(0, statements.get(0).getConditions().size());
        assertEquals(1, statements.get(0).getPrincipals().size());
        assertEquals("workspaces.amazonaws.com", statements.get(0)
                .getPrincipals().get(0).getId());
        assertEquals("Service", statements.get(0).getPrincipals().get(0)
                .getProvider());
    }

    @Test
    public void testAccountNamePrincipalWithDashesAreStrippedByDefault() {
        String jsonString =
                  "{" +
                    "\"Version\": \"2012-10-17\"," +
                    "\"Statement\": [" +
                      "{" +
                        "\"Effect\": \"Allow\"," +
                        "\"Principal\": {" +
                        "\"AWS\": \"test-string\"" +
                        "}" +
                      "}" +
                    "]" +
                 "}" ;
        Policy policy = Policy.fromJson(jsonString);
        List<Statement> statements = new ArrayList<Statement>(policy.getStatements());

        assertEquals("teststring", statements.get(0).getPrincipals().get(0).getId());
    }

    @Test
    public void testAccountNamePrincipalWithDashesAreNotStrippedWhenDisabled() {
        String jsonString =
                  "{" +
                    "\"Version\": \"2012-10-17\"," +
                    "\"Statement\": [" +
                      "{" +
                        "\"Effect\": \"Allow\"," +
                        "\"Principal\": {" +
                        "\"AWS\": \"test-string\"" +
                        "}" +
                      "}" +
                    "]" +
                 "}" ;
        Policy policy = Policy.fromJson(jsonString, new PolicyReaderOptions().withStripAwsPrincipalIdHyphensEnabled(false));
        List<Statement> statements = new ArrayList<Statement>(policy.getStatements());

        assertEquals("test-string", statements.get(0).getPrincipals().get(0).getId());
    }
}
