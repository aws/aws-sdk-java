/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides details about sensitive data that was detected on a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DataClassificationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataClassificationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the folder or file that contains the sensitive data.
     * </p>
     */
    private String detailedResultsLocation;
    /**
     * <p>
     * The details about the sensitive data that was detected on the resource.
     * </p>
     */
    private ClassificationResult result;

    /**
     * <p>
     * The path to the folder or file that contains the sensitive data.
     * </p>
     * 
     * @param detailedResultsLocation
     *        The path to the folder or file that contains the sensitive data.
     */

    public void setDetailedResultsLocation(String detailedResultsLocation) {
        this.detailedResultsLocation = detailedResultsLocation;
    }

    /**
     * <p>
     * The path to the folder or file that contains the sensitive data.
     * </p>
     * 
     * @return The path to the folder or file that contains the sensitive data.
     */

    public String getDetailedResultsLocation() {
        return this.detailedResultsLocation;
    }

    /**
     * <p>
     * The path to the folder or file that contains the sensitive data.
     * </p>
     * 
     * @param detailedResultsLocation
     *        The path to the folder or file that contains the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataClassificationDetails withDetailedResultsLocation(String detailedResultsLocation) {
        setDetailedResultsLocation(detailedResultsLocation);
        return this;
    }

    /**
     * <p>
     * The details about the sensitive data that was detected on the resource.
     * </p>
     * 
     * @param result
     *        The details about the sensitive data that was detected on the resource.
     */

    public void setResult(ClassificationResult result) {
        this.result = result;
    }

    /**
     * <p>
     * The details about the sensitive data that was detected on the resource.
     * </p>
     * 
     * @return The details about the sensitive data that was detected on the resource.
     */

    public ClassificationResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * The details about the sensitive data that was detected on the resource.
     * </p>
     * 
     * @param result
     *        The details about the sensitive data that was detected on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataClassificationDetails withResult(ClassificationResult result) {
        setResult(result);
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
        if (getDetailedResultsLocation() != null)
            sb.append("DetailedResultsLocation: ").append(getDetailedResultsLocation()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataClassificationDetails == false)
            return false;
        DataClassificationDetails other = (DataClassificationDetails) obj;
        if (other.getDetailedResultsLocation() == null ^ this.getDetailedResultsLocation() == null)
            return false;
        if (other.getDetailedResultsLocation() != null && other.getDetailedResultsLocation().equals(this.getDetailedResultsLocation()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedResultsLocation() == null) ? 0 : getDetailedResultsLocation().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public DataClassificationDetails clone() {
        try {
            return (DataClassificationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.DataClassificationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
