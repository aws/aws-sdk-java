/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest) RetrieveEnvironmentInfo operation}.
 * <p>
 * Retrieves the compiled information from a RequestEnvironmentInfo
 * request.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * 
 * <ul>
 * <li> RequestEnvironmentInfo </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest)
 */
public class RetrieveEnvironmentInfoRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the data's environment. <p> If no such environment is found,
     * returns an <code>InvalidParameterValue</code> error.
     */
    private String environmentId;

    /**
     * The name of the data's environment. <p> If no such environment is
     * found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The type of information to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     */
    private String infoType;

    /**
     * Default constructor for a new RetrieveEnvironmentInfoRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RetrieveEnvironmentInfoRequest() {}
    
    /**
     * Constructs a new RetrieveEnvironmentInfoRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param infoType The type of information to retrieve.
     */
    public RetrieveEnvironmentInfoRequest(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The ID of the data's environment. <p> If no such environment is found,
     * returns an <code>InvalidParameterValue</code> error.
     *
     * @return The ID of the data's environment. <p> If no such environment is found,
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the data's environment. <p> If no such environment is found,
     * returns an <code>InvalidParameterValue</code> error.
     *
     * @param environmentId The ID of the data's environment. <p> If no such environment is found,
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the data's environment. <p> If no such environment is found,
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the data's environment. <p> If no such environment is found,
     *         returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RetrieveEnvironmentInfoRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * The name of the data's environment. <p> If no such environment is
     * found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the data's environment. <p> If no such environment is
     *         found, returns an <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the data's environment. <p> If no such environment is
     * found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the data's environment. <p> If no such environment is
     *         found, returns an <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the data's environment. <p> If no such environment is
     * found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the data's environment. <p> If no such environment is
     *         found, returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RetrieveEnvironmentInfoRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * The type of information to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @return The type of information to retrieve.
     *
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }
    
    /**
     * The type of information to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information to retrieve.
     *
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The type of information to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information to retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EnvironmentInfoType
     */
    public RetrieveEnvironmentInfoRequest withInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("EnvironmentId: " + environmentId + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("InfoType: " + infoType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    