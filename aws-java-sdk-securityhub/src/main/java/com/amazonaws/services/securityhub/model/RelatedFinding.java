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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Related finding's details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RelatedFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the solution that generated a related finding.
     * </p>
     */
    private String productArn;
    /**
     * <p>
     * The solution-generated identifier for a related finding.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ARN of the solution that generated a related finding.
     * </p>
     * 
     * @param productArn
     *        The ARN of the solution that generated a related finding.
     */

    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN of the solution that generated a related finding.
     * </p>
     * 
     * @return The ARN of the solution that generated a related finding.
     */

    public String getProductArn() {
        return this.productArn;
    }

    /**
     * <p>
     * The ARN of the solution that generated a related finding.
     * </p>
     * 
     * @param productArn
     *        The ARN of the solution that generated a related finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedFinding withProductArn(String productArn) {
        setProductArn(productArn);
        return this;
    }

    /**
     * <p>
     * The solution-generated identifier for a related finding.
     * </p>
     * 
     * @param id
     *        The solution-generated identifier for a related finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The solution-generated identifier for a related finding.
     * </p>
     * 
     * @return The solution-generated identifier for a related finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The solution-generated identifier for a related finding.
     * </p>
     * 
     * @param id
     *        The solution-generated identifier for a related finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedFinding withId(String id) {
        setId(id);
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
        if (getProductArn() != null)
            sb.append("ProductArn: ").append(getProductArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedFinding == false)
            return false;
        RelatedFinding other = (RelatedFinding) obj;
        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public RelatedFinding clone() {
        try {
            return (RelatedFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RelatedFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
