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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * HIT Review Policy data structures represent HIT review policies, which you specify when you create a HIT.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ReviewPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * Name of the parameter from the Review policy.
     * </p>
     */
    private java.util.List<PolicyParameter> parameters;

    /**
     * <p>
     * Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     * </p>
     * 
     * @param policyName
     *        Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     * </p>
     * 
     * @return Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     * </p>
     * 
     * @param policyName
     *        Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * Name of the parameter from the Review policy.
     * </p>
     * 
     * @return Name of the parameter from the Review policy.
     */

    public java.util.List<PolicyParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Name of the parameter from the Review policy.
     * </p>
     * 
     * @param parameters
     *        Name of the parameter from the Review policy.
     */

    public void setParameters(java.util.Collection<PolicyParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<PolicyParameter>(parameters);
    }

    /**
     * <p>
     * Name of the parameter from the Review policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Name of the parameter from the Review policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewPolicy withParameters(PolicyParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<PolicyParameter>(parameters.length));
        }
        for (PolicyParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Name of the parameter from the Review policy.
     * </p>
     * 
     * @param parameters
     *        Name of the parameter from the Review policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewPolicy withParameters(java.util.Collection<PolicyParameter> parameters) {
        setParameters(parameters);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewPolicy == false)
            return false;
        ReviewPolicy other = (ReviewPolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ReviewPolicy clone() {
        try {
            return (ReviewPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.ReviewPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
