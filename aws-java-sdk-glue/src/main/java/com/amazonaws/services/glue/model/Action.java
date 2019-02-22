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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an action to be initiated by a trigger.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Action" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the
     * job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> arguments;
    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     */
    private NotificationProperty notificationProperty;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this action.
     * </p>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * 
     * @param jobName
     *        The name of a job to be executed.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * 
     * @return The name of a job to be executed.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * 
     * @param jobName
     *        The name of a job to be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the
     * job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @return The job arguments used when this trigger fires. For this job run, they replace the default arguments set
     *         in the job definition itself.</p>
     *         <p>
     *         You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *         Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own Job arguments, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS
     *         Glue APIs in Python</a> topic in the developer guide.
     *         </p>
     *         <p>
     *         For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *         Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the
     * job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param arguments
     *        The job arguments used when this trigger fires. For this job run, they replace the default arguments set
     *        in the job definition itself.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the
     * job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param arguments
     *        The job arguments used when this trigger fires. For this job run, they replace the default arguments set
     *        in the job definition itself.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    public Action addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @param timeout
     *        The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides
     *        the timeout value set in the parent job.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @return The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *         terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This
     *         overrides the timeout value set in the parent job.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @param timeout
     *        The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides
     *        the timeout value set in the parent job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job run notification.
     */

    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @return Specifies configuration properties of a job run notification.
     */

    public NotificationProperty getNotificationProperty() {
        return this.notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job run notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withNotificationProperty(NotificationProperty notificationProperty) {
        setNotificationProperty(notificationProperty);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this action.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this action.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this action.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with this action.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this action.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: ").append(getNotificationProperty()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
