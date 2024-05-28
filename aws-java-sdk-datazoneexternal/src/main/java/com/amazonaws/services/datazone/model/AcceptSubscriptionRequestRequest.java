/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptSubscriptionRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptSubscriptionRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description that specifies the reason for accepting the specified subscription request.
     * </p>
     */
    private String decisionComment;
    /**
     * <p>
     * The Amazon DataZone domain where the specified subscription request is being accepted.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The unique identifier of the subscription request that is to be accepted.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * A description that specifies the reason for accepting the specified subscription request.
     * </p>
     * 
     * @param decisionComment
     *        A description that specifies the reason for accepting the specified subscription request.
     */

    public void setDecisionComment(String decisionComment) {
        this.decisionComment = decisionComment;
    }

    /**
     * <p>
     * A description that specifies the reason for accepting the specified subscription request.
     * </p>
     * 
     * @return A description that specifies the reason for accepting the specified subscription request.
     */

    public String getDecisionComment() {
        return this.decisionComment;
    }

    /**
     * <p>
     * A description that specifies the reason for accepting the specified subscription request.
     * </p>
     * 
     * @param decisionComment
     *        A description that specifies the reason for accepting the specified subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptSubscriptionRequestRequest withDecisionComment(String decisionComment) {
        setDecisionComment(decisionComment);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone domain where the specified subscription request is being accepted.
     * </p>
     * 
     * @param domainIdentifier
     *        The Amazon DataZone domain where the specified subscription request is being accepted.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The Amazon DataZone domain where the specified subscription request is being accepted.
     * </p>
     * 
     * @return The Amazon DataZone domain where the specified subscription request is being accepted.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The Amazon DataZone domain where the specified subscription request is being accepted.
     * </p>
     * 
     * @param domainIdentifier
     *        The Amazon DataZone domain where the specified subscription request is being accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptSubscriptionRequestRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the subscription request that is to be accepted.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the subscription request that is to be accepted.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the subscription request that is to be accepted.
     * </p>
     * 
     * @return The unique identifier of the subscription request that is to be accepted.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the subscription request that is to be accepted.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the subscription request that is to be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptSubscriptionRequestRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getDecisionComment() != null)
            sb.append("DecisionComment: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptSubscriptionRequestRequest == false)
            return false;
        AcceptSubscriptionRequestRequest other = (AcceptSubscriptionRequestRequest) obj;
        if (other.getDecisionComment() == null ^ this.getDecisionComment() == null)
            return false;
        if (other.getDecisionComment() != null && other.getDecisionComment().equals(this.getDecisionComment()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecisionComment() == null) ? 0 : getDecisionComment().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public AcceptSubscriptionRequestRequest clone() {
        return (AcceptSubscriptionRequestRequest) super.clone();
    }

}
