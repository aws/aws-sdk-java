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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Cases domain.
     * </p>
     */
    private String domainArn;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The status of the domain.
     * </p>
     */
    private String domainStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Cases domain.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) for the Cases domain.
     */

    public void setDomainArn(String domainArn) {
        this.domainArn = domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Cases domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Cases domain.
     */

    public String getDomainArn() {
        return this.domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Cases domain.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) for the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainResult withDomainArn(String domainArn) {
        setDomainArn(domainArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The status of the domain.
     * @see DomainStatus
     */

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * 
     * @return The status of the domain.
     * @see DomainStatus
     */

    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The status of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public CreateDomainResult withDomainStatus(String domainStatus) {
        setDomainStatus(domainStatus);
        return this;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The status of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public CreateDomainResult withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
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
        if (getDomainArn() != null)
            sb.append("DomainArn: ").append(getDomainArn()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainStatus() != null)
            sb.append("DomainStatus: ").append(getDomainStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainResult == false)
            return false;
        CreateDomainResult other = (CreateDomainResult) obj;
        if (other.getDomainArn() == null ^ this.getDomainArn() == null)
            return false;
        if (other.getDomainArn() != null && other.getDomainArn().equals(this.getDomainArn()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainArn() == null) ? 0 : getDomainArn().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainResult clone() {
        try {
            return (CreateDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
