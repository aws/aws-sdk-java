/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DiscoverInputSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     */
    private InputStartingPositionConfiguration inputStartingPositionConfiguration;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the streaming source.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the streaming source.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *        source discovery purposes.
     */

    public void setInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        this.inputStartingPositionConfiguration = inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @return Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *         source discovery purposes.
     */

    public InputStartingPositionConfiguration getInputStartingPositionConfiguration() {
        return this.inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *        source discovery purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        setInputStartingPositionConfiguration(inputStartingPositionConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getInputStartingPositionConfiguration() != null)
            sb.append("InputStartingPositionConfiguration: " + getInputStartingPositionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInputSchemaRequest == false)
            return false;
        DiscoverInputSchemaRequest other = (DiscoverInputSchemaRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getInputStartingPositionConfiguration() == null ^ this.getInputStartingPositionConfiguration() == null)
            return false;
        if (other.getInputStartingPositionConfiguration() != null
                && other.getInputStartingPositionConfiguration().equals(this.getInputStartingPositionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getInputStartingPositionConfiguration() == null) ? 0 : getInputStartingPositionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInputSchemaRequest clone() {
        return (DiscoverInputSchemaRequest) super.clone();
    }
}
