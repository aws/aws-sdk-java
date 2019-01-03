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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RequestEnvironmentInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestEnvironmentInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The type of information to request.
     * </p>
     */
    private String infoType;

    /**
     * Default constructor for RequestEnvironmentInfoRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public RequestEnvironmentInfoRequest() {
    }

    /**
     * Constructs a new RequestEnvironmentInfoRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param infoType
     *        The type of information to request.
     */
    public RequestEnvironmentInfoRequest(String infoType) {
        setInfoType(infoType);
    }

    /**
     * Constructs a new RequestEnvironmentInfoRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param infoType
     *        The type of information to request.
     */
    public RequestEnvironmentInfoRequest(EnvironmentInfoType infoType) {
        setInfoType(infoType.toString());
    }

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment of the requested data.</p>
     *        <p>
     *        If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The ID of the environment of the requested data.</p>
     *         <p>
     *         If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment of the requested data.</p>
     *        <p>
     *        If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestEnvironmentInfoRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment of the requested data.</p>
     *        <p>
     *        If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The name of the environment of the requested data.</p>
     *         <p>
     *         If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment of the requested data.
     * </p>
     * <p>
     * If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment of the requested data.</p>
     *        <p>
     *        If no such environment is found, <code>RequestEnvironmentInfo</code> returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestEnvironmentInfoRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * 
     * @param infoType
     *        The type of information to request.
     * @see EnvironmentInfoType
     */

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * 
     * @return The type of information to request.
     * @see EnvironmentInfoType
     */

    public String getInfoType() {
        return this.infoType;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * 
     * @param infoType
     *        The type of information to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentInfoType
     */

    public RequestEnvironmentInfoRequest withInfoType(String infoType) {
        setInfoType(infoType);
        return this;
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * 
     * @param infoType
     *        The type of information to request.
     * @see EnvironmentInfoType
     */

    public void setInfoType(EnvironmentInfoType infoType) {
        withInfoType(infoType);
    }

    /**
     * <p>
     * The type of information to request.
     * </p>
     * 
     * @param infoType
     *        The type of information to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentInfoType
     */

    public RequestEnvironmentInfoRequest withInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getInfoType() != null)
            sb.append("InfoType: ").append(getInfoType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestEnvironmentInfoRequest == false)
            return false;
        RequestEnvironmentInfoRequest other = (RequestEnvironmentInfoRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getInfoType() == null ^ this.getInfoType() == null)
            return false;
        if (other.getInfoType() != null && other.getInfoType().equals(this.getInfoType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getInfoType() == null) ? 0 : getInfoType().hashCode());
        return hashCode;
    }

    @Override
    public RequestEnvironmentInfoRequest clone() {
        return (RequestEnvironmentInfoRequest) super.clone();
    }

}
