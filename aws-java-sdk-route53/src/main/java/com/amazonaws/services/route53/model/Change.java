/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The information for each resource record set that you want to change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/Change" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Change implements Serializable, Cloneable {

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     */
    private ResourceRecordSet resourceRecordSet;

    /**
     * Default constructor for Change object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Change() {
    }

    /**
     * Constructs a new Change object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @param resourceRecordSet
     *        Information about the resource record set to create, delete, or update.
     */
    public Change(String action, ResourceRecordSet resourceRecordSet) {
        setAction(action);
        setResourceRecordSet(resourceRecordSet);
    }

    /**
     * Constructs a new Change object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @param resourceRecordSet
     *        Information about the resource record set to create, delete, or update.
     */
    public Change(ChangeAction action, ResourceRecordSet resourceRecordSet) {
        setAction(action.toString());
        setResourceRecordSet(resourceRecordSet);
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action to perform:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE</code>: Creates a resource record set that has the specified values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code>: Deletes a existing resource record set.
     *         </p>
     *         <important>
     *         <p>
     *         To delete the resource record set that is associated with a traffic policy instance, use <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *         >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *         you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *         automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *         it's no longer in use.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *         record set does exist, Route 53 updates it with the values in the request.
     *         </p>
     *         </li>
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public Change withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If you
     * delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't automatically
     * delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource record
     * set does exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: Creates a resource record set that has the specified values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: Deletes a existing resource record set.
     *        </p>
     *        <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *        >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the resource record set automatically. If
     *        you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *        automatically delete the traffic policy instance, and you'll continue to be charged for it even though
     *        it's no longer in use.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>UPSERT</code>: If a resource record set doesn't already exist, Route 53 creates it. If a resource
     *        record set does exist, Route 53 updates it with the values in the request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public Change withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     * 
     * @param resourceRecordSet
     *        Information about the resource record set to create, delete, or update.
     */

    public void setResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     * 
     * @return Information about the resource record set to create, delete, or update.
     */

    public ResourceRecordSet getResourceRecordSet() {
        return this.resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     * 
     * @param resourceRecordSet
     *        Information about the resource record set to create, delete, or update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Change withResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        setResourceRecordSet(resourceRecordSet);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getResourceRecordSet() != null)
            sb.append("ResourceRecordSet: ").append(getResourceRecordSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResourceRecordSet() == null ^ this.getResourceRecordSet() == null)
            return false;
        if (other.getResourceRecordSet() != null && other.getResourceRecordSet().equals(this.getResourceRecordSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResourceRecordSet() == null) ? 0 : getResourceRecordSet().hashCode());
        return hashCode;
    }

    @Override
    public Change clone() {
        try {
            return (Change) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
