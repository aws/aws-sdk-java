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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the DataIntegration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DataIntegrationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataIntegrationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URI of the data source.
     * </p>
     */
    private String sourceURI;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DataIntegration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DataIntegration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @return The name of the DataIntegration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @param sourceURI
     *        The URI of the data source.
     */

    public void setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @return The URI of the data source.
     */

    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @param sourceURI
     *        The URI of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationSummary withSourceURI(String sourceURI) {
        setSourceURI(sourceURI);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceURI() != null)
            sb.append("SourceURI: ").append(getSourceURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataIntegrationSummary == false)
            return false;
        DataIntegrationSummary other = (DataIntegrationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceURI() == null ^ this.getSourceURI() == null)
            return false;
        if (other.getSourceURI() != null && other.getSourceURI().equals(this.getSourceURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceURI() == null) ? 0 : getSourceURI().hashCode());
        return hashCode;
    }

    @Override
    public DataIntegrationSummary clone() {
        try {
            return (DataIntegrationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.DataIntegrationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
