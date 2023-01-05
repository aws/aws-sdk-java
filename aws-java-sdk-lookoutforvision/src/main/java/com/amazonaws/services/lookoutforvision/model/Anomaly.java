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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an anomaly type found on an image by an image segmentation model. For more information, see
 * <a>DetectAnomalies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/Anomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Anomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training dataset,
     * apart from the anomaly type <code>background</code>. The service automatically inserts the
     * <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the pixel mask that covers an anomaly type.
     * </p>
     */
    private PixelAnomaly pixelAnomaly;

    /**
     * <p>
     * The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training dataset,
     * apart from the anomaly type <code>background</code>. The service automatically inserts the
     * <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     * </p>
     * 
     * @param name
     *        The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training
     *        dataset, apart from the anomaly type <code>background</code>. The service automatically inserts the
     *        <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training dataset,
     * apart from the anomaly type <code>background</code>. The service automatically inserts the
     * <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     * </p>
     * 
     * @return The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training
     *         dataset, apart from the anomaly type <code>background</code>. The service automatically inserts the
     *         <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training dataset,
     * apart from the anomaly type <code>background</code>. The service automatically inserts the
     * <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     * </p>
     * 
     * @param name
     *        The name of an anomaly type found in an image. <code>Name</code> maps to an anomaly type in the training
     *        dataset, apart from the anomaly type <code>background</code>. The service automatically inserts the
     *        <code>background</code> anomaly type into the response from <code>DetectAnomalies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the pixel mask that covers an anomaly type.
     * </p>
     * 
     * @param pixelAnomaly
     *        Information about the pixel mask that covers an anomaly type.
     */

    public void setPixelAnomaly(PixelAnomaly pixelAnomaly) {
        this.pixelAnomaly = pixelAnomaly;
    }

    /**
     * <p>
     * Information about the pixel mask that covers an anomaly type.
     * </p>
     * 
     * @return Information about the pixel mask that covers an anomaly type.
     */

    public PixelAnomaly getPixelAnomaly() {
        return this.pixelAnomaly;
    }

    /**
     * <p>
     * Information about the pixel mask that covers an anomaly type.
     * </p>
     * 
     * @param pixelAnomaly
     *        Information about the pixel mask that covers an anomaly type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withPixelAnomaly(PixelAnomaly pixelAnomaly) {
        setPixelAnomaly(pixelAnomaly);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPixelAnomaly() != null)
            sb.append("PixelAnomaly: ").append(getPixelAnomaly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Anomaly == false)
            return false;
        Anomaly other = (Anomaly) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPixelAnomaly() == null ^ this.getPixelAnomaly() == null)
            return false;
        if (other.getPixelAnomaly() != null && other.getPixelAnomaly().equals(this.getPixelAnomaly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPixelAnomaly() == null) ? 0 : getPixelAnomaly().hashCode());
        return hashCode;
    }

    @Override
    public Anomaly clone() {
        try {
            return (Anomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.AnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
