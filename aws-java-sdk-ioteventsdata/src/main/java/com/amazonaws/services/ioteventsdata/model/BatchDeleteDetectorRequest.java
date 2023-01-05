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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDeleteDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of one or more detectors to be deleted.
     * </p>
     */
    private java.util.List<DeleteDetectorRequest> detectors;

    /**
     * <p>
     * The list of one or more detectors to be deleted.
     * </p>
     * 
     * @return The list of one or more detectors to be deleted.
     */

    public java.util.List<DeleteDetectorRequest> getDetectors() {
        return detectors;
    }

    /**
     * <p>
     * The list of one or more detectors to be deleted.
     * </p>
     * 
     * @param detectors
     *        The list of one or more detectors to be deleted.
     */

    public void setDetectors(java.util.Collection<DeleteDetectorRequest> detectors) {
        if (detectors == null) {
            this.detectors = null;
            return;
        }

        this.detectors = new java.util.ArrayList<DeleteDetectorRequest>(detectors);
    }

    /**
     * <p>
     * The list of one or more detectors to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectors(java.util.Collection)} or {@link #withDetectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detectors
     *        The list of one or more detectors to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDetectorRequest withDetectors(DeleteDetectorRequest... detectors) {
        if (this.detectors == null) {
            setDetectors(new java.util.ArrayList<DeleteDetectorRequest>(detectors.length));
        }
        for (DeleteDetectorRequest ele : detectors) {
            this.detectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of one or more detectors to be deleted.
     * </p>
     * 
     * @param detectors
     *        The list of one or more detectors to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDetectorRequest withDetectors(java.util.Collection<DeleteDetectorRequest> detectors) {
        setDetectors(detectors);
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
        if (getDetectors() != null)
            sb.append("Detectors: ").append(getDetectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDetectorRequest == false)
            return false;
        BatchDeleteDetectorRequest other = (BatchDeleteDetectorRequest) obj;
        if (other.getDetectors() == null ^ this.getDetectors() == null)
            return false;
        if (other.getDetectors() != null && other.getDetectors().equals(this.getDetectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectors() == null) ? 0 : getDetectors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDetectorRequest clone() {
        return (BatchDeleteDetectorRequest) super.clone();
    }

}
