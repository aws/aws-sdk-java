/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutManagedRuleSetVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutManagedRuleSetVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or
     * an Amazon Cognito user pool.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     */
    private String lockToken;
    /**
     * <p>
     * The version of the named managed rule group that you'd like your customers to choose, from among your version
     * offerings.
     * </p>
     */
    private String recommendedVersion;
    /**
     * <p>
     * The versions of the named managed rule group that you want to offer to your customers.
     * </p>
     */
    private java.util.Map<String, VersionToPublish> versionsToPublish;

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @param name
     *        The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *        <p>
     *        This name is assigned to the corresponding managed rule group, which your customers can access and use.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @return The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *         <p>
     *         This name is assigned to the corresponding managed rule group, which your customers can access and use.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @param name
     *        The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *        <p>
     *        This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or
     * an Amazon Cognito user pool.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, or an Amazon Cognito user pool. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or
     * an Amazon Cognito user pool.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *         API, or an Amazon Cognito user pool. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the Region when you use the CloudFront scope:
     *         <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         API and SDKs - For all calls, use the Region endpoint us-east-1.
     *         </p>
     *         </li>
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or
     * an Amazon Cognito user pool.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, or an Amazon Cognito user pool. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public PutManagedRuleSetVersionsRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or
     * an Amazon Cognito user pool.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, or an Amazon Cognito user pool. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public PutManagedRuleSetVersionsRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *        <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @return A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *         <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *        <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *         requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *         associated with the token, you provide the token to operations like <code>update</code> and
     *         <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *         last retrieved it. If a change has been made, the update fails with a
     *         <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest withLockToken(String lockToken) {
        setLockToken(lockToken);
        return this;
    }

    /**
     * <p>
     * The version of the named managed rule group that you'd like your customers to choose, from among your version
     * offerings.
     * </p>
     * 
     * @param recommendedVersion
     *        The version of the named managed rule group that you'd like your customers to choose, from among your
     *        version offerings.
     */

    public void setRecommendedVersion(String recommendedVersion) {
        this.recommendedVersion = recommendedVersion;
    }

    /**
     * <p>
     * The version of the named managed rule group that you'd like your customers to choose, from among your version
     * offerings.
     * </p>
     * 
     * @return The version of the named managed rule group that you'd like your customers to choose, from among your
     *         version offerings.
     */

    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    /**
     * <p>
     * The version of the named managed rule group that you'd like your customers to choose, from among your version
     * offerings.
     * </p>
     * 
     * @param recommendedVersion
     *        The version of the named managed rule group that you'd like your customers to choose, from among your
     *        version offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest withRecommendedVersion(String recommendedVersion) {
        setRecommendedVersion(recommendedVersion);
        return this;
    }

    /**
     * <p>
     * The versions of the named managed rule group that you want to offer to your customers.
     * </p>
     * 
     * @return The versions of the named managed rule group that you want to offer to your customers.
     */

    public java.util.Map<String, VersionToPublish> getVersionsToPublish() {
        return versionsToPublish;
    }

    /**
     * <p>
     * The versions of the named managed rule group that you want to offer to your customers.
     * </p>
     * 
     * @param versionsToPublish
     *        The versions of the named managed rule group that you want to offer to your customers.
     */

    public void setVersionsToPublish(java.util.Map<String, VersionToPublish> versionsToPublish) {
        this.versionsToPublish = versionsToPublish;
    }

    /**
     * <p>
     * The versions of the named managed rule group that you want to offer to your customers.
     * </p>
     * 
     * @param versionsToPublish
     *        The versions of the named managed rule group that you want to offer to your customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest withVersionsToPublish(java.util.Map<String, VersionToPublish> versionsToPublish) {
        setVersionsToPublish(versionsToPublish);
        return this;
    }

    /**
     * Add a single VersionsToPublish entry
     *
     * @see PutManagedRuleSetVersionsRequest#withVersionsToPublish
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest addVersionsToPublishEntry(String key, VersionToPublish value) {
        if (null == this.versionsToPublish) {
            this.versionsToPublish = new java.util.HashMap<String, VersionToPublish>();
        }
        if (this.versionsToPublish.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.versionsToPublish.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VersionsToPublish.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedRuleSetVersionsRequest clearVersionsToPublishEntries() {
        this.versionsToPublish = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken()).append(",");
        if (getRecommendedVersion() != null)
            sb.append("RecommendedVersion: ").append(getRecommendedVersion()).append(",");
        if (getVersionsToPublish() != null)
            sb.append("VersionsToPublish: ").append(getVersionsToPublish());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutManagedRuleSetVersionsRequest == false)
            return false;
        PutManagedRuleSetVersionsRequest other = (PutManagedRuleSetVersionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        if (other.getRecommendedVersion() == null ^ this.getRecommendedVersion() == null)
            return false;
        if (other.getRecommendedVersion() != null && other.getRecommendedVersion().equals(this.getRecommendedVersion()) == false)
            return false;
        if (other.getVersionsToPublish() == null ^ this.getVersionsToPublish() == null)
            return false;
        if (other.getVersionsToPublish() != null && other.getVersionsToPublish().equals(this.getVersionsToPublish()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendedVersion() == null) ? 0 : getRecommendedVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionsToPublish() == null) ? 0 : getVersionsToPublish().hashCode());
        return hashCode;
    }

    @Override
    public PutManagedRuleSetVersionsRequest clone() {
        return (PutManagedRuleSetVersionsRequest) super.clone();
    }

}
