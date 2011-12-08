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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplicationVersion(DeleteApplicationVersionRequest) DeleteApplicationVersion operation}.
 * <p>
 * Deletes the specified version from the specified application.
 * </p>
 * <p>
 * <b>NOTE:</b>You cannot delete an application version that is
 * associated with a running environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplicationVersion(DeleteApplicationVersionRequest)
 */
public class DeleteApplicationVersionRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     */
    private Boolean deleteSourceBundle;

    /**
     * Default constructor for a new DeleteApplicationVersionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteApplicationVersionRequest() {}
    
    /**
     * Constructs a new DeleteApplicationVersionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to delete releases
     * from.
     * @param versionLabel The label of the version to delete.
     */
    public DeleteApplicationVersionRequest(String applicationName, String versionLabel) {
        this.applicationName = applicationName;
        this.versionLabel = versionLabel;
    }

    
    
    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to delete releases from.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete releases from.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to delete releases from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete releases from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The label of the version to delete.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The label of the version to delete.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The label of the version to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The label of the version to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean isDeleteSourceBundle() {
        return deleteSourceBundle;
    }
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @param deleteSourceBundle Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public void setDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
    }
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteSourceBundle Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteApplicationVersionRequest withDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
        return this;
    }
    
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean getDeleteSourceBundle() {
        return deleteSourceBundle;
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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("DeleteSourceBundle: " + deleteSourceBundle + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    