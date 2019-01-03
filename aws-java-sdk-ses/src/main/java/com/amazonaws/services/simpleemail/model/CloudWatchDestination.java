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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information associated with an Amazon CloudWatch event destination to which email sending events are
 * published.
 * </p>
 * <p>
 * Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which enable you to publish
 * email sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloudWatchDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchDestination implements Serializable, Cloneable {

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     * CloudWatch.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration> dimensionConfigurations;

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     * CloudWatch.
     * </p>
     * 
     * @return A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     *         CloudWatch.
     */

    public java.util.List<CloudWatchDimensionConfiguration> getDimensionConfigurations() {
        if (dimensionConfigurations == null) {
            dimensionConfigurations = new com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration>();
        }
        return dimensionConfigurations;
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     * CloudWatch.
     * </p>
     * 
     * @param dimensionConfigurations
     *        A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     *        CloudWatch.
     */

    public void setDimensionConfigurations(java.util.Collection<CloudWatchDimensionConfiguration> dimensionConfigurations) {
        if (dimensionConfigurations == null) {
            this.dimensionConfigurations = null;
            return;
        }

        this.dimensionConfigurations = new com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration>(dimensionConfigurations);
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionConfigurations(java.util.Collection)} or
     * {@link #withDimensionConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dimensionConfigurations
     *        A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     *        CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchDestination withDimensionConfigurations(CloudWatchDimensionConfiguration... dimensionConfigurations) {
        if (this.dimensionConfigurations == null) {
            setDimensionConfigurations(new com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration>(dimensionConfigurations.length));
        }
        for (CloudWatchDimensionConfiguration ele : dimensionConfigurations) {
            this.dimensionConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     * CloudWatch.
     * </p>
     * 
     * @param dimensionConfigurations
     *        A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon
     *        CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchDestination withDimensionConfigurations(java.util.Collection<CloudWatchDimensionConfiguration> dimensionConfigurations) {
        setDimensionConfigurations(dimensionConfigurations);
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
        if (getDimensionConfigurations() != null)
            sb.append("DimensionConfigurations: ").append(getDimensionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchDestination == false)
            return false;
        CloudWatchDestination other = (CloudWatchDestination) obj;
        if (other.getDimensionConfigurations() == null ^ this.getDimensionConfigurations() == null)
            return false;
        if (other.getDimensionConfigurations() != null && other.getDimensionConfigurations().equals(this.getDimensionConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionConfigurations() == null) ? 0 : getDimensionConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchDestination clone() {
        try {
            return (CloudWatchDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
