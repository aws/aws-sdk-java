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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ExportSourceNetworkCfnTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSourceNetworkCfnTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Source Network ID to export its CloudFormation template to an S3 bucket.
     * </p>
     */
    private String sourceNetworkID;

    /**
     * <p>
     * The Source Network ID to export its CloudFormation template to an S3 bucket.
     * </p>
     * 
     * @param sourceNetworkID
     *        The Source Network ID to export its CloudFormation template to an S3 bucket.
     */

    public void setSourceNetworkID(String sourceNetworkID) {
        this.sourceNetworkID = sourceNetworkID;
    }

    /**
     * <p>
     * The Source Network ID to export its CloudFormation template to an S3 bucket.
     * </p>
     * 
     * @return The Source Network ID to export its CloudFormation template to an S3 bucket.
     */

    public String getSourceNetworkID() {
        return this.sourceNetworkID;
    }

    /**
     * <p>
     * The Source Network ID to export its CloudFormation template to an S3 bucket.
     * </p>
     * 
     * @param sourceNetworkID
     *        The Source Network ID to export its CloudFormation template to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSourceNetworkCfnTemplateRequest withSourceNetworkID(String sourceNetworkID) {
        setSourceNetworkID(sourceNetworkID);
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
        if (getSourceNetworkID() != null)
            sb.append("SourceNetworkID: ").append(getSourceNetworkID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSourceNetworkCfnTemplateRequest == false)
            return false;
        ExportSourceNetworkCfnTemplateRequest other = (ExportSourceNetworkCfnTemplateRequest) obj;
        if (other.getSourceNetworkID() == null ^ this.getSourceNetworkID() == null)
            return false;
        if (other.getSourceNetworkID() != null && other.getSourceNetworkID().equals(this.getSourceNetworkID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceNetworkID() == null) ? 0 : getSourceNetworkID().hashCode());
        return hashCode;
    }

    @Override
    public ExportSourceNetworkCfnTemplateRequest clone() {
        return (ExportSourceNetworkCfnTemplateRequest) super.clone();
    }

}
