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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFraudsterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain containing the fraudster.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the fraudster you are describing.
     * </p>
     */
    private String fraudsterId;

    /**
     * <p>
     * The identifier of the domain containing the fraudster.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the fraudster.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the fraudster.
     * </p>
     * 
     * @return The identifier of the domain containing the fraudster.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the fraudster.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFraudsterRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the fraudster you are describing.
     * </p>
     * 
     * @param fraudsterId
     *        The identifier of the fraudster you are describing.
     */

    public void setFraudsterId(String fraudsterId) {
        this.fraudsterId = fraudsterId;
    }

    /**
     * <p>
     * The identifier of the fraudster you are describing.
     * </p>
     * 
     * @return The identifier of the fraudster you are describing.
     */

    public String getFraudsterId() {
        return this.fraudsterId;
    }

    /**
     * <p>
     * The identifier of the fraudster you are describing.
     * </p>
     * 
     * @param fraudsterId
     *        The identifier of the fraudster you are describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFraudsterRequest withFraudsterId(String fraudsterId) {
        setFraudsterId(fraudsterId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFraudsterId() != null)
            sb.append("FraudsterId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFraudsterRequest == false)
            return false;
        DescribeFraudsterRequest other = (DescribeFraudsterRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFraudsterId() == null ^ this.getFraudsterId() == null)
            return false;
        if (other.getFraudsterId() != null && other.getFraudsterId().equals(this.getFraudsterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFraudsterId() == null) ? 0 : getFraudsterId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFraudsterRequest clone() {
        return (DescribeFraudsterRequest) super.clone();
    }

}
