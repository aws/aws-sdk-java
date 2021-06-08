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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration details of the CloudWatch Logs destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CloudWatchLogsDestinationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsDestinationDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudWatch Logs log group.
     * </p>
     */
    private String logGroup;

    /**
     * <p>
     * The name of the CloudWatch Logs log group.
     * </p>
     * 
     * @param logGroup
     *        The name of the CloudWatch Logs log group.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log group.
     * </p>
     * 
     * @return The name of the CloudWatch Logs log group.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log group.
     * </p>
     * 
     * @param logGroup
     *        The name of the CloudWatch Logs log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsDestinationDetails withLogGroup(String logGroup) {
        setLogGroup(logGroup);
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
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsDestinationDetails == false)
            return false;
        CloudWatchLogsDestinationDetails other = (CloudWatchLogsDestinationDetails) obj;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsDestinationDetails clone() {
        try {
            return (CloudWatchLogsDestinationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
