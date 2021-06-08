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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/StartDetectorModelAnalysis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDetectorModelAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private DetectorModelDefinition detectorModelDefinition;

    /**
     * @param detectorModelDefinition
     */

    public void setDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    /**
     * @return
     */

    public DetectorModelDefinition getDetectorModelDefinition() {
        return this.detectorModelDefinition;
    }

    /**
     * @param detectorModelDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectorModelAnalysisRequest withDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        setDetectorModelDefinition(detectorModelDefinition);
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
        if (getDetectorModelDefinition() != null)
            sb.append("DetectorModelDefinition: ").append(getDetectorModelDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDetectorModelAnalysisRequest == false)
            return false;
        StartDetectorModelAnalysisRequest other = (StartDetectorModelAnalysisRequest) obj;
        if (other.getDetectorModelDefinition() == null ^ this.getDetectorModelDefinition() == null)
            return false;
        if (other.getDetectorModelDefinition() != null && other.getDetectorModelDefinition().equals(this.getDetectorModelDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelDefinition() == null) ? 0 : getDetectorModelDefinition().hashCode());
        return hashCode;
    }

    @Override
    public StartDetectorModelAnalysisRequest clone() {
        return (StartDetectorModelAnalysisRequest) super.clone();
    }

}
