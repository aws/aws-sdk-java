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

import com.amazonaws.auth.policy.internal.JsonPolicyReader;
import com.amazonaws.auth.policy.internal.JsonPolicyWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * An AWS access control policy is a object that acts as a container for one or
 * more statements, which specify fine grained rules for allowing or denying
 * various types of actions from being performed on your AWS resources.
 * <p>
 * By default, all requests to use your resource coming from anyone but you are
 * denied. Access control polices can override that by allowing different types
 * of access to your resources, or by explicitly denying different types of
 * access.
 * <p>
 * Each statement in an AWS access control policy takes the form:
 * "A has permission to do B to C where D applies".
 * <ul>
 *   <li>A is the <b>principal</b> - the AWS account that is making a request to
 *       access or modify one of your AWS resources.
 *   <li>B is the <b>action</b> - the way in which your AWS resource is being accessed or modified, such
 *       as sending a message to an Amazon SQS queue, or storing an object in an Amazon S3 bucket.
 *   <li>C is the <b>resource</b> - your AWS entity that the principal wants to access, such
 *       as an Amazon SQS queue, or an object stored in Amazon S3.
 *   <li>D is the set of <b>conditions</b> - optional constraints that specify when to allow or deny
 *       access for the principal to access your resource.  Many expressive conditions are available,
 *       some specific to each service.  For example you can use date conditions to allow access to
 *       your resources only after or before a specific time.
 * </ul>
 * <p>
 * Note that an AWS access control policy should not be confused with the
 * similarly named "POST form policy" concept used in Amazon S3.
 */
public class Policy {

    /** The default policy version */
    private static final String DEFAULT_POLICY_VERSION = "2012-10-17";

    private String id;
    private String version = DEFAULT_POLICY_VERSION;
    private List<Statement> statements = new ArrayList<Statement>();

    /**
     * Constructs an empty AWS access control policy ready to be populated with
     * statements.
     */
    public Policy() {}

    /**
     * Constructs a new AWS access control policy with the specified policy ID.
     * The policy ID is a user specified string that serves to help developers
     * keep track of multiple polices. Policy IDs are often used as a human
     * readable name for a policy.
     *
     * @param id
     *            The policy ID for the new policy object. Policy IDs serve to
     *            help developers keep track of multiple policies, and are often
     *            used to give the policy a meaningful, human readable name.
     */
    public Policy(String id) {
        this.id = id;
    }

    /**
     * Constructs a new AWS access control policy with the specified policy ID
     * and collection of statements. The policy ID is a user specified string
     * that serves to help developers keep track of multiple polices. Policy IDs
     * are often used as a human readable name for a policy.
     * <p>
     * Any statements that don't have a statement ID yet will automatically be
     * assigned a unique ID within this policy.
     *
     * @param id
     *            The policy ID for the new policy object. Policy IDs serve to
     *            help developers keep track of multiple policies, and are often
     *            used to give the policy a meaningful, human readable name.
     * @param statements
     *            The statements to include in the new policy.
     */
    public Policy(String id, Collection<Statement> statements) {
        this(id);
        setStatements(statements);
    }

    /**
     * Returns the policy ID for this policy. Policy IDs serve to help
     * developers keep track of multiple policies, and are often used as human
     * readable name for a policy.
     *
     * @return The policy ID for this policy.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the policy ID for this policy. Policy IDs serve to help developers
     * keep track of multiple policies, and are often used as human readable
     * name for a policy.
     *
     * @param id
     *            The policy ID for this policy.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the policy ID for this policy and returns the updated policy so that
     * multiple calls can be chained together.
     * <p>
     * Policy IDs serve to help developers keep track of multiple policies, and
     * are often used as human readable name for a policy.
     *
     * @param id
     *            The policy ID for this policy.
     *
     * @return The updated Policy object so that additional calls can be chained
     *         together.
     */
    public Policy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the version of this AWS policy.
     *
     * @return The version of this AWS policy.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Returns the collection of statements contained by this policy. Individual
     * statements in a policy are what specify the rules that enable or disable
     * access to your AWS resources.
     *
     * @return The collection of statements contained by this policy.
     */
    public Collection<Statement> getStatements() {
        return statements;
    }

    /**
     * Sets the collection of statements contained by this policy. Individual
     * statements in a policy are what specify the rules that enable or disable
     * access to your AWS resources.
     * <p>
     * Any statements that don't have a statement ID yet will automatically be
     * assigned a unique ID within this policy.
     *
     * @param statements
     *            The collection of statements included in this policy.
     */
    public void setStatements(Collection<Statement> statements) {
        this.statements = new ArrayList<Statement>(statements);
        assignUniqueStatementIds();
    }

    /**
     * Sets the collection of statements contained by this policy and returns
     * this policy object so that additional method calls can be chained
     * together.
     * <p>
     * Individual statements in a policy are what specify the rules that enable
     * or disable access to your AWS resources.
     * <p>
     * Any statements that don't have a statement ID yet will automatically be
     * assigned a unique ID within this policy.
     *
     * @param statements
     *            The collection of statements included in this policy.
     *
     * @return The updated policy object, so that additional method calls can be
     *         chained together.
     */
    public Policy withStatements(Statement... statements) {
        setStatements(Arrays.asList(statements));
        return this;
    }

    /**
     * Returns a JSON string representation of this AWS access control policy,
     * suitable to be sent to an AWS service as part of a request to set an
     * access control policy.
     *
     * @return A JSON string representation of this AWS access control policy.
     */
    public String toJson() {
        return new JsonPolicyWriter().writePolicyToString(this);
    }

    /**
     * Returns an AWS access control policy object generated from JSON string. This will automatically strip all dashes from
     * AWS principal IDs, because AWS account IDs must not contain dashes. If this behavior isn't desirable (eg. because you are
     * using IAM AWS principal IDs with dashes in the name), you may disable this behavior by specifying custom JSON policy reader
     * options in {@link #fromJson(String, PolicyReaderOptions)}.
     *
     * @param jsonString
     *            The JSON string representation of this AWS access control policy.
     *
     * @return An AWS access control policy object.
     *
     * @throws IllegalArgumentException
     *      If the specified JSON string is null or invalid and cannot be
     *      converted to an AWS policy object.
     */
    public static Policy fromJson(String jsonString) {
        return fromJson(jsonString, new PolicyReaderOptions());
    }

    /**
     * Returns an AWS access control policy object generated from JSON string. Allows configuring options for the JSON policy
     * reader (for example, to disable the stripping of dashes in the principal ID).
     *
     * @param jsonString
     *            The JSON string representation of this AWS access control policy.
     * @param options
     *            Configuration for the JSON policy reader that affects the way in which it converts the JSON configuration.
     *
     * @return An AWS access control policy object.
     *
     * @throws IllegalArgumentException
     *      If the specified JSON string is null or invalid and cannot be
     *      converted to an AWS policy object.
     */
    public static Policy fromJson(String jsonString, PolicyReaderOptions options) {
        return new JsonPolicyReader(options).createPolicyFromJsonString(jsonString);
    }

    private void assignUniqueStatementIds() {
        Set<String> usedStatementIds = new HashSet<String>();
        for (Statement statement : statements) {
            if (statement.getId() != null) usedStatementIds.add(statement.getId());
        }

        int counter = 0;
        for (Statement statement : statements) {
            if (statement.getId() != null) continue;

            while (usedStatementIds.contains(Integer.toString(++counter)));
            statement.setId(Integer.toString(counter));
        }
    }

}
