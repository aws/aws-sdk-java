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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     */
    private String policyInJson;
    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     */
    private String policyHashCondition;
    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     */
    private String policyExistsCondition;

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the policy document to set, in JSON format.
     */

    public void setPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @return Contains the policy document to set, in JSON format.
     */

    public String getPolicyInJson() {
        return this.policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the policy document to set, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyInJson(String policyInJson) {
        setPolicyInJson(policyInJson);
        return this;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose
     *        is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has
     *        been set.
     */

    public void setPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @return The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its
     *         purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous
     *         policy has been set.
     */

    public String getPolicyHashCondition() {
        return this.policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose
     *        is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has
     *        been set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyHashCondition(String policyHashCondition) {
        setPolicyHashCondition(policyHashCondition);
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @see ExistCondition
     */

    public void setPolicyExistsCondition(String policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @return A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *         to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *         on the existence of a policy.
     * @see ExistCondition
     */

    public String getPolicyExistsCondition() {
        return this.policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistCondition
     */

    public PutResourcePolicyRequest withPolicyExistsCondition(String policyExistsCondition) {
        setPolicyExistsCondition(policyExistsCondition);
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistCondition
     */

    public PutResourcePolicyRequest withPolicyExistsCondition(ExistCondition policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition.toString();
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
        if (getPolicyInJson() != null)
            sb.append("PolicyInJson: ").append(getPolicyInJson()).append(",");
        if (getPolicyHashCondition() != null)
            sb.append("PolicyHashCondition: ").append(getPolicyHashCondition()).append(",");
        if (getPolicyExistsCondition() != null)
            sb.append("PolicyExistsCondition: ").append(getPolicyExistsCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getPolicyInJson() == null ^ this.getPolicyInJson() == null)
            return false;
        if (other.getPolicyInJson() != null && other.getPolicyInJson().equals(this.getPolicyInJson()) == false)
            return false;
        if (other.getPolicyHashCondition() == null ^ this.getPolicyHashCondition() == null)
            return false;
        if (other.getPolicyHashCondition() != null && other.getPolicyHashCondition().equals(this.getPolicyHashCondition()) == false)
            return false;
        if (other.getPolicyExistsCondition() == null ^ this.getPolicyExistsCondition() == null)
            return false;
        if (other.getPolicyExistsCondition() != null && other.getPolicyExistsCondition().equals(this.getPolicyExistsCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyInJson() == null) ? 0 : getPolicyInJson().hashCode());
        hashCode = prime * hashCode + ((getPolicyHashCondition() == null) ? 0 : getPolicyHashCondition().hashCode());
        hashCode = prime * hashCode + ((getPolicyExistsCondition() == null) ? 0 : getPolicyExistsCondition().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
