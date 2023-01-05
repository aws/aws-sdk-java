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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure representing a screenshot that is used as a baseline during visual monitoring comparisons made by the
 * canary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/BaseScreenshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaseScreenshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the screenshot. This is generated the first time the canary is run after the
     * <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     * </p>
     */
    private String screenshotName;
    /**
     * <p>
     * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates
     * to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html"> Editing
     * or deleting a canary</a>
     * </p>
     */
    private java.util.List<String> ignoreCoordinates;

    /**
     * <p>
     * The name of the screenshot. This is generated the first time the canary is run after the
     * <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     * </p>
     * 
     * @param screenshotName
     *        The name of the screenshot. This is generated the first time the canary is run after the
     *        <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     */

    public void setScreenshotName(String screenshotName) {
        this.screenshotName = screenshotName;
    }

    /**
     * <p>
     * The name of the screenshot. This is generated the first time the canary is run after the
     * <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     * </p>
     * 
     * @return The name of the screenshot. This is generated the first time the canary is run after the
     *         <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     */

    public String getScreenshotName() {
        return this.screenshotName;
    }

    /**
     * <p>
     * The name of the screenshot. This is generated the first time the canary is run after the
     * <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     * </p>
     * 
     * @param screenshotName
     *        The name of the screenshot. This is generated the first time the canary is run after the
     *        <code>UpdateCanary</code> operation that specified for this canary to perform visual monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseScreenshot withScreenshotName(String screenshotName) {
        setScreenshotName(screenshotName);
        return this;
    }

    /**
     * <p>
     * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates
     * to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html"> Editing
     * or deleting a canary</a>
     * </p>
     * 
     * @return Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the
     *         coordinates to use here, use the CloudWatch console to draw the boundaries on the screen. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html">
     *         Editing or deleting a canary</a>
     */

    public java.util.List<String> getIgnoreCoordinates() {
        return ignoreCoordinates;
    }

    /**
     * <p>
     * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates
     * to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html"> Editing
     * or deleting a canary</a>
     * </p>
     * 
     * @param ignoreCoordinates
     *        Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the
     *        coordinates to use here, use the CloudWatch console to draw the boundaries on the screen. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html">
     *        Editing or deleting a canary</a>
     */

    public void setIgnoreCoordinates(java.util.Collection<String> ignoreCoordinates) {
        if (ignoreCoordinates == null) {
            this.ignoreCoordinates = null;
            return;
        }

        this.ignoreCoordinates = new java.util.ArrayList<String>(ignoreCoordinates);
    }

    /**
     * <p>
     * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates
     * to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html"> Editing
     * or deleting a canary</a>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIgnoreCoordinates(java.util.Collection)} or {@link #withIgnoreCoordinates(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ignoreCoordinates
     *        Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the
     *        coordinates to use here, use the CloudWatch console to draw the boundaries on the screen. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html">
     *        Editing or deleting a canary</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseScreenshot withIgnoreCoordinates(String... ignoreCoordinates) {
        if (this.ignoreCoordinates == null) {
            setIgnoreCoordinates(new java.util.ArrayList<String>(ignoreCoordinates.length));
        }
        for (String ele : ignoreCoordinates) {
            this.ignoreCoordinates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates
     * to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html"> Editing
     * or deleting a canary</a>
     * </p>
     * 
     * @param ignoreCoordinates
     *        Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the
     *        coordinates to use here, use the CloudWatch console to draw the boundaries on the screen. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html">
     *        Editing or deleting a canary</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseScreenshot withIgnoreCoordinates(java.util.Collection<String> ignoreCoordinates) {
        setIgnoreCoordinates(ignoreCoordinates);
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
        if (getScreenshotName() != null)
            sb.append("ScreenshotName: ").append(getScreenshotName()).append(",");
        if (getIgnoreCoordinates() != null)
            sb.append("IgnoreCoordinates: ").append(getIgnoreCoordinates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaseScreenshot == false)
            return false;
        BaseScreenshot other = (BaseScreenshot) obj;
        if (other.getScreenshotName() == null ^ this.getScreenshotName() == null)
            return false;
        if (other.getScreenshotName() != null && other.getScreenshotName().equals(this.getScreenshotName()) == false)
            return false;
        if (other.getIgnoreCoordinates() == null ^ this.getIgnoreCoordinates() == null)
            return false;
        if (other.getIgnoreCoordinates() != null && other.getIgnoreCoordinates().equals(this.getIgnoreCoordinates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScreenshotName() == null) ? 0 : getScreenshotName().hashCode());
        hashCode = prime * hashCode + ((getIgnoreCoordinates() == null) ? 0 : getIgnoreCoordinates().hashCode());
        return hashCode;
    }

    @Override
    public BaseScreenshot clone() {
        try {
            return (BaseScreenshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.BaseScreenshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
