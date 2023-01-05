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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomLogSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     */
    private String customSourceName;
    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom
     * source will send to Security Lake.
     * </p>
     */
    private String eventClass;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue crawler.
     * The recommended IAM policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The managed policy <code>AWSGlueServiceRole</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom policy granting access to your Amazon S3 Data Lake
     * </p>
     * </li>
     * </ul>
     */
    private String glueInvocationRoleArn;
    /**
     * <p>
     * The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3 Data
     * Lake.
     * </p>
     */
    private String logProviderAccountId;

    /**
     * <p>
     * The name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @param customSourceName
     *        The name for a third-party custom source. This must be a Regionally unique value.
     */

    public void setCustomSourceName(String customSourceName) {
        this.customSourceName = customSourceName;
    }

    /**
     * <p>
     * The name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @return The name for a third-party custom source. This must be a Regionally unique value.
     */

    public String getCustomSourceName() {
        return this.customSourceName;
    }

    /**
     * <p>
     * The name for a third-party custom source. This must be a Regionally unique value.
     * </p>
     * 
     * @param customSourceName
     *        The name for a third-party custom source. This must be a Regionally unique value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withCustomSourceName(String customSourceName) {
        setCustomSourceName(customSourceName);
        return this;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom
     * source will send to Security Lake.
     * </p>
     * 
     * @param eventClass
     *        The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the
     *        custom source will send to Security Lake.
     * @see OcsfEventClass
     */

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom
     * source will send to Security Lake.
     * </p>
     * 
     * @return The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the
     *         custom source will send to Security Lake.
     * @see OcsfEventClass
     */

    public String getEventClass() {
        return this.eventClass;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom
     * source will send to Security Lake.
     * </p>
     * 
     * @param eventClass
     *        The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the
     *        custom source will send to Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OcsfEventClass
     */

    public CreateCustomLogSourceRequest withEventClass(String eventClass) {
        setEventClass(eventClass);
        return this;
    }

    /**
     * <p>
     * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom
     * source will send to Security Lake.
     * </p>
     * 
     * @param eventClass
     *        The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the
     *        custom source will send to Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OcsfEventClass
     */

    public CreateCustomLogSourceRequest withEventClass(OcsfEventClass eventClass) {
        this.eventClass = eventClass.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue crawler.
     * The recommended IAM policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The managed policy <code>AWSGlueServiceRole</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom policy granting access to your Amazon S3 Data Lake
     * </p>
     * </li>
     * </ul>
     * 
     * @param glueInvocationRoleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue
     *        crawler. The recommended IAM policies are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The managed policy <code>AWSGlueServiceRole</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom policy granting access to your Amazon S3 Data Lake
     *        </p>
     *        </li>
     */

    public void setGlueInvocationRoleArn(String glueInvocationRoleArn) {
        this.glueInvocationRoleArn = glueInvocationRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue crawler.
     * The recommended IAM policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The managed policy <code>AWSGlueServiceRole</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom policy granting access to your Amazon S3 Data Lake
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue
     *         crawler. The recommended IAM policies are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The managed policy <code>AWSGlueServiceRole</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A custom policy granting access to your Amazon S3 Data Lake
     *         </p>
     *         </li>
     */

    public String getGlueInvocationRoleArn() {
        return this.glueInvocationRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue crawler.
     * The recommended IAM policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The managed policy <code>AWSGlueServiceRole</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom policy granting access to your Amazon S3 Data Lake
     * </p>
     * </li>
     * </ul>
     * 
     * @param glueInvocationRoleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue
     *        crawler. The recommended IAM policies are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The managed policy <code>AWSGlueServiceRole</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom policy granting access to your Amazon S3 Data Lake
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withGlueInvocationRoleArn(String glueInvocationRoleArn) {
        setGlueInvocationRoleArn(glueInvocationRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3 Data
     * Lake.
     * </p>
     * 
     * @param logProviderAccountId
     *        The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3
     *        Data Lake.
     */

    public void setLogProviderAccountId(String logProviderAccountId) {
        this.logProviderAccountId = logProviderAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3 Data
     * Lake.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon
     *         S3 Data Lake.
     */

    public String getLogProviderAccountId() {
        return this.logProviderAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3 Data
     * Lake.
     * </p>
     * 
     * @param logProviderAccountId
     *        The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3
     *        Data Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceRequest withLogProviderAccountId(String logProviderAccountId) {
        setLogProviderAccountId(logProviderAccountId);
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
        if (getCustomSourceName() != null)
            sb.append("CustomSourceName: ").append(getCustomSourceName()).append(",");
        if (getEventClass() != null)
            sb.append("EventClass: ").append(getEventClass()).append(",");
        if (getGlueInvocationRoleArn() != null)
            sb.append("GlueInvocationRoleArn: ").append(getGlueInvocationRoleArn()).append(",");
        if (getLogProviderAccountId() != null)
            sb.append("LogProviderAccountId: ").append(getLogProviderAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomLogSourceRequest == false)
            return false;
        CreateCustomLogSourceRequest other = (CreateCustomLogSourceRequest) obj;
        if (other.getCustomSourceName() == null ^ this.getCustomSourceName() == null)
            return false;
        if (other.getCustomSourceName() != null && other.getCustomSourceName().equals(this.getCustomSourceName()) == false)
            return false;
        if (other.getEventClass() == null ^ this.getEventClass() == null)
            return false;
        if (other.getEventClass() != null && other.getEventClass().equals(this.getEventClass()) == false)
            return false;
        if (other.getGlueInvocationRoleArn() == null ^ this.getGlueInvocationRoleArn() == null)
            return false;
        if (other.getGlueInvocationRoleArn() != null && other.getGlueInvocationRoleArn().equals(this.getGlueInvocationRoleArn()) == false)
            return false;
        if (other.getLogProviderAccountId() == null ^ this.getLogProviderAccountId() == null)
            return false;
        if (other.getLogProviderAccountId() != null && other.getLogProviderAccountId().equals(this.getLogProviderAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomSourceName() == null) ? 0 : getCustomSourceName().hashCode());
        hashCode = prime * hashCode + ((getEventClass() == null) ? 0 : getEventClass().hashCode());
        hashCode = prime * hashCode + ((getGlueInvocationRoleArn() == null) ? 0 : getGlueInvocationRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogProviderAccountId() == null) ? 0 : getLogProviderAccountId().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomLogSourceRequest clone() {
        return (CreateCustomLogSourceRequest) super.clone();
    }

}
