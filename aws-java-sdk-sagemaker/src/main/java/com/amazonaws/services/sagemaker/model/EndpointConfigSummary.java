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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information for an endpoint configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointConfigSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     */
    private String endpointConfigArn;
    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @return The name of the endpoint configuration.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointConfigSummary withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public void setEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public String getEndpointConfigArn() {
        return this.endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointConfigSummary withEndpointConfigArn(String endpointConfigArn) {
        setEndpointConfigArn(endpointConfigArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @return A timestamp that shows when the endpoint configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointConfigSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: ").append(getEndpointConfigArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointConfigSummary == false)
            return false;
        EndpointConfigSummary other = (EndpointConfigSummary) obj;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public EndpointConfigSummary clone() {
        try {
            return (EndpointConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
