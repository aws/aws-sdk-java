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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StartApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     * </p>
     */
    private RunConfiguration runConfiguration;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     * </p>
     * 
     * @param runConfiguration
     *        Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     */

    public void setRunConfiguration(RunConfiguration runConfiguration) {
        this.runConfiguration = runConfiguration;
    }

    /**
     * <p>
     * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     * </p>
     * 
     * @return Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     */

    public RunConfiguration getRunConfiguration() {
        return this.runConfiguration;
    }

    /**
     * <p>
     * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     * </p>
     * 
     * @param runConfiguration
     *        Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartApplicationRequest withRunConfiguration(RunConfiguration runConfiguration) {
        setRunConfiguration(runConfiguration);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getRunConfiguration() != null)
            sb.append("RunConfiguration: ").append(getRunConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartApplicationRequest == false)
            return false;
        StartApplicationRequest other = (StartApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRunConfiguration() == null ^ this.getRunConfiguration() == null)
            return false;
        if (other.getRunConfiguration() != null && other.getRunConfiguration().equals(this.getRunConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRunConfiguration() == null) ? 0 : getRunConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartApplicationRequest clone() {
        return (StartApplicationRequest) super.clone();
    }

}
