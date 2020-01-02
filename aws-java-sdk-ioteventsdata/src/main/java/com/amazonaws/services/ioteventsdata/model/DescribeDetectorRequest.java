/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the detector model whose detectors (instances) you want information about.
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * A filter used to limit results to detectors (instances) created because of the given key ID.
     * </p>
     */
    private String keyValue;

    /**
     * <p>
     * The name of the detector model whose detectors (instances) you want information about.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model whose detectors (instances) you want information about.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model whose detectors (instances) you want information about.
     * </p>
     * 
     * @return The name of the detector model whose detectors (instances) you want information about.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model whose detectors (instances) you want information about.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model whose detectors (instances) you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorRequest withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * A filter used to limit results to detectors (instances) created because of the given key ID.
     * </p>
     * 
     * @param keyValue
     *        A filter used to limit results to detectors (instances) created because of the given key ID.
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * A filter used to limit results to detectors (instances) created because of the given key ID.
     * </p>
     * 
     * @return A filter used to limit results to detectors (instances) created because of the given key ID.
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * A filter used to limit results to detectors (instances) created because of the given key ID.
     * </p>
     * 
     * @param keyValue
     *        A filter used to limit results to detectors (instances) created because of the given key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorRequest withKeyValue(String keyValue) {
        setKeyValue(keyValue);
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorRequest == false)
            return false;
        DescribeDetectorRequest other = (DescribeDetectorRequest) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectorRequest clone() {
        return (DescribeDetectorRequest) super.clone();
    }

}
