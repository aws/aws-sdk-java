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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the detector (instance).
     * </p>
     */
    private Detector detector;

    /**
     * <p>
     * Information about the detector (instance).
     * </p>
     * 
     * @param detector
     *        Information about the detector (instance).
     */

    public void setDetector(Detector detector) {
        this.detector = detector;
    }

    /**
     * <p>
     * Information about the detector (instance).
     * </p>
     * 
     * @return Information about the detector (instance).
     */

    public Detector getDetector() {
        return this.detector;
    }

    /**
     * <p>
     * Information about the detector (instance).
     * </p>
     * 
     * @param detector
     *        Information about the detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorResult withDetector(Detector detector) {
        setDetector(detector);
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
        if (getDetector() != null)
            sb.append("Detector: ").append(getDetector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorResult == false)
            return false;
        DescribeDetectorResult other = (DescribeDetectorResult) obj;
        if (other.getDetector() == null ^ this.getDetector() == null)
            return false;
        if (other.getDetector() != null && other.getDetector().equals(this.getDetector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetector() == null) ? 0 : getDetector().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectorResult clone() {
        try {
            return (DescribeDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
