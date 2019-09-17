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

import com.amazonaws.util.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * A statement is the formal description of a single permission, and is always
 * contained within a policy object.
 * <p>
 * A statement describes a rule for allowing or denying access to a specific AWS
 * resource based on how the resource is being accessed, and who is attempting
 * to access the resource. Statements can also optionally contain a list of
 * conditions that specify when a statement is to be honored.
 * <p>
 * For example, consider a statement that:
 * <ul>
 * <li>allows access (the effect)
 * <li>for a list of specific AWS account IDs (the principals)
 * <li>when accessing an SQS queue (the resource)
 * <li>using the SendMessage operation (the action)
 * <li>and the request occurs before a specific date (a condition)
 * </ul>
 *
 * <p>
 * Statements takes the form:  "A has permission to do B to C where D applies".
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
 *
 * <p>
 * There are many resources and conditions available for use in statements, and
 * you can combine them to form fine grained custom access control polices.
 */
public class Statement {

    /**
     * The effect is the result that you want a policy statement to return at
     * evaluation time. A policy statement can either allow access or explicitly
     * deny access.
     */
    public static enum Effect {
        Allow(), Deny();
    }

    private String id;
    private Effect effect;
    private List<Principal> principals = new ArrayList<Principal>();
    private List<Action> actions = new ArrayList<Action>();
    private List<Resource> resources;
    private List<Condition> conditions = new ArrayList<Condition>();

    /**
     * Constructs a new access control policy statement with the specified
     * effect.
     * <p>
     * Before a statement is valid and can be sent to AWS, callers must set the
     * principals, resources, and actions (as well as any optional conditions)
     * involved in the statement.
     *
     * @param effect
     *            The effect this statement has (allowing access or denying
     *            access) when all conditions, resources, principals, and
     *            actions are matched.
     */
    public Statement(Effect effect) {
        this.effect = effect;
        this.id = null;
    }

    /**
     * Returns the ID for this statement. Statement IDs serve to help keep track
     * of multiple statements, and are often used to give the statement a
     * meaningful, human readable name.
     * <p>
     * Statement IDs must be unique within a policy, but are not required to be
     * globally unique.
     * <p>
     * If you do not explicitly assign an ID to a statement, a unique ID will be
     * automatically assigned when the statement is added to a policy.
     * <p>
     * Developers should be careful to not use the same statement ID for
     * multiple statements in the same policy. Reusing the same statement ID in
     * different policies is not a problem.
     *
     * @return The statement ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID for this statement. Statement IDs serve to help keep track of
     * multiple statements, and are often used to give the statement a
     * meaningful, human readable name.
     * <p>
     * Statement IDs must be unique within a policy, but are not required to be
     * globally unique.
     * <p>
     * If you do not explicitly assign an ID to a statement, a unique ID will be
     * automatically assigned when the statement is added to a policy.
     * <p>
     * Developers should be careful to not use the same statement ID for
     * multiple statements in the same policy. Reusing the same statement ID in
     * different policies is not a problem.
     *
     * @param id
     *            The new statement ID for this statement.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the ID for this statement and returns the updated statement so
     * multiple calls can be chained together.
     * <p>
     * Statement IDs serve to help keep track of multiple statements, and are
     * often used to give the statement a meaningful, human readable name.
     * <p>
     * If you do not explicitly assign an ID to a statement, a unique ID will be
     * automatically assigned when the statement is added to a policy.
     * <p>
     * Developers should be careful to not use the same statement ID for
     * multiple statements in the same policy. Reusing the same statement ID in
     * different policies is not a problem.
     *
     * @param id
     *            The new statement ID for this statement.
     */
    public Statement withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the result effect of this policy statement when it is evaluated.
     * A policy statement can either allow access or explicitly
     *
     * @return The result effect of this policy statement.
     */
    public Effect getEffect() {
        return effect;
    }

    /**
     * Sets the result effect of this policy statement when it is evaluated. A
     * policy statement can either allow access or explicitly
     *
     * @param effect
     *            The result effect of this policy statement.
     */
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    /**
     * Returns the list of actions to which this policy statement applies.
     * Actions limit a policy statement to specific service operations that are
     * being allowed or denied by the policy statement. For example, you might
     * want to allow any AWS user to post messages to your SQS queue using the
     * SendMessage action, but you don't want to allow those users other actions
     * such as ReceiveMessage or DeleteQueue.
     *
     * @return The list of actions to which this policy statement applies.
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * Sets the list of actions to which this policy statement applies. Actions
     * limit a policy statement to specific service operations that are being
     * allowed or denied by the policy statement. For example, you might want to
     * allow any AWS user to post messages to your SQS queue using the
     * SendMessage action, but you don't want to allow those users other actions
     * such as ReceiveMessage or DeleteQueue.
     *
     * @param actions
     *            The list of actions to which this policy statement applies.
     */
    public void setActions(Collection<Action> actions) {
        this.actions = new ArrayList<Action>(actions);
    }

    /**
     * Sets the list of actions to which this policy statement applies and
     * returns this updated Statement object so that additional method calls can
     * be chained together.
     * <p>
     * Actions limit a policy statement to specific service operations that are
     * being allowed or denied by the policy statement. For example, you might
     * want to allow any AWS user to post messages to your SQS queue using the
     * SendMessage action, but you don't want to allow those users other actions
     * such as ReceiveMessage or DeleteQueue.
     *
     * @param actions
     *            The list of actions to which this statement applies.
     *
     * @return The updated Statement object so that additional method calls can
     *         be chained together.
     */
    public Statement withActions(Action... actions) {
        setActions(Arrays.asList(actions));
        return this;
    }

    /**
     * Returns the resources associated with this policy statement. Resources
     * are what a policy statement is allowing or denying access to, such as an
     * Amazon SQS queue or an Amazon SNS topic.
     * <p>
     * Note that some services allow only one resource to be specified per
     * policy statement.
     *
     * @return The resources associated with this policy statement.
     */
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * Sets the resources associated with this policy statement. Resources are
     * what a policy statement is allowing or denying access to, such as an
     * Amazon SQS queue or an Amazon SNS topic.
     * <p>
     * Note that some services allow only one resource to be specified per
     * policy statement.
     *
     * @param resources
     *            The resources associated with this policy statement.
     * @throws IllegalArgumentException
     *             If the list of resources contains both a Resource and a NotResource
     */
    public void setResources(Collection<Resource> resources) {
        List<Resource> resourceList = new ArrayList<Resource>(resources);
        PolicyUtils.validateResourceList(resourceList);
        this.resources = resourceList;
    }

    /**
     * Sets the resources associated with this policy statement and returns this
     * updated Statement object so that additional method calls can be chained
     * together.
     * <p>
     * Resources are what a policy statement is allowing or denying access to,
     * such as an Amazon SQS queue or an Amazon SNS topic.
     * <p>
     * Note that some services allow only one resource to be specified per
     * policy statement.
     *
     * @param resources
     *            The resources associated with this policy statement.
     *
     * @return The updated Statement object so that additional method calls can
     *         be chained together.
     */
    public Statement withResources(Resource... resources) {
        setResources(Arrays.asList(resources));
        return this;
    }

    /**
     * Returns the conditions associated with this policy statement. Conditions
     * allow policy statements to be conditionally evaluated based on the many
     * available condition types.
     * <p>
     * For example, a statement that allows access to an Amazon SQS queue could
     * use a condition to only apply the effect of that statement for requests
     * that are made before a certain date, or that originate from a range of IP
     * addresses.
     * <p>
     * When multiple conditions are included in a single statement, all
     * conditions must evaluate to true in order for the statement to take
     * effect.
     *
     * @return The conditions associated with this policy statement.
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Sets the conditions associated with this policy statement. Conditions
     * allow policy statements to be conditionally evaluated based on the many
     * available condition types.
     * <p>
     * For example, a statement that allows access to an Amazon SQS queue could
     * use a condition to only apply the effect of that statement for requests
     * that are made before a certain date, or that originate from a range of IP
     * addresses.
     * <p>
     * Multiple conditions can be included in a single statement, and all
     * conditions must evaluate to true in order for the statement to take
     * effect.
     *
     * @param conditions
     *            The conditions associated with this policy statement.
     */
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * Sets the conditions associated with this policy statement, and returns
     * this updated Statement object so that additional method calls can be
     * chained together.
     * <p>
     * Conditions allow policy statements to be conditionally evaluated based on
     * the many available condition types.
     * <p>
     * For example, a statement that allows access to an Amazon SQS queue could
     * use a condition to only apply the effect of that statement for requests
     * that are made before a certain date, or that originate from a range of IP
     * addresses.
     * <p>
     * Multiple conditions can be included in a single statement, and all
     * conditions must evaluate to true in order for the statement to take
     * effect.
     *
     * @param conditions
     *            The conditions associated with this policy statement.
     *
     * @return The updated Statement object so that additional method calls can
     *         be chained together.
     */
    public Statement withConditions(Condition... conditions) {
        setConditions(Arrays.asList(conditions));
        return this;
    }

    /**
     * Returns the principals associated with this policy statement, indicating
     * which AWS accounts are affected by this policy statement.
     *
     * @return The list of principals associated with this policy statement.
     */
    public List<Principal> getPrincipals() {
        return principals;
    }

    /**
     * Sets the principals associated with this policy statement, indicating
     * which AWS accounts are affected by this policy statement.
     * <p>
     * If you don't want to restrict your policy to specific users, you can use
     * {@link Principal#AllUsers} to apply the policy to any user trying to
     * access your resource.
     *
     * @param principals
     *            The list of principals associated with this policy statement.
     */
    public void setPrincipals(Collection<Principal> principals) {
        this.principals = new ArrayList<Principal>(principals);
    }

    /**
     * Sets the principals associated with this policy statement, indicating
     * which AWS accounts are affected by this policy statement.
     * <p>
     * If you don't want to restrict your policy to specific users, you can use
     * {@link Principal#AllUsers} to apply the policy to any user trying to
     * access your resource.
     *
     * @param principals
     *            The list of principals associated with this policy statement.
     */
    public void setPrincipals(Principal... principals) {
        setPrincipals(new ArrayList<Principal>(Arrays.asList(principals)));
    }

    /**
     * Sets the principals associated with this policy statement, and returns
     * this updated Statement object. Principals control which AWS accounts are
     * affected by this policy statement.
     * <p>
     * If you don't want to restrict your policy to specific users, you can use
     * {@link Principal#AllUsers} to apply the policy to any user trying to
     * access your resource.
     *
     * @param principals
     *            The list of principals associated with this policy statement.
     *
     * @return The updated Statement object so that additional method calls can
     *         be chained together.
     */
    public Statement withPrincipals(Principal... principals) {
        setPrincipals(principals);
        return this;
    }

}
