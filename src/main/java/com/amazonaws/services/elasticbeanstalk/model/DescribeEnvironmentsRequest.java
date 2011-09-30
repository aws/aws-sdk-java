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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironments(DescribeEnvironmentsRequest) DescribeEnvironments operation}.
 * <p>
 * Returns descriptions for existing environments.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironments(DescribeEnvironmentsRequest)
 */
public class DescribeEnvironmentsRequest extends AmazonWebServiceRequest {

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified IDs.
     */
    private java.util.List<String> environmentIds;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     */
    private java.util.List<String> environmentNames;

    /**
     * Indicates whether to include deleted environments: <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed. <p>
     * <code>false</code>: Do not include deleted environments.
     */
    private Boolean includeDeleted;

    /**
     * If specified when <code>IncludeDeleted</code> is set to
     * <code>true</code>, then environments deleted after this date are
     * displayed.
     */
    private java.util.Date includedDeletedBackTo;

    /**
     * Default constructor for a new DescribeEnvironmentsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeEnvironmentsRequest() {}
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application version.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application version.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that are associated with this
     * application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified IDs.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified IDs.
     */
    public java.util.List<String> getEnvironmentIds() {
        
        if (environmentIds == null) {
            environmentIds = new java.util.ArrayList<String>();
        }
        return environmentIds;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified IDs.
     *
     * @param environmentIds If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified IDs.
     */
    public void setEnvironmentIds(java.util.Collection<String> environmentIds) {
        java.util.List<String> environmentIdsCopy = new java.util.ArrayList<String>();
        if (environmentIds != null) {
            environmentIdsCopy.addAll(environmentIds);
        }
        this.environmentIds = environmentIdsCopy;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentIds If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withEnvironmentIds(String... environmentIds) {
        if (getEnvironmentIds() == null) setEnvironmentIds(new java.util.ArrayList<String>());
        for (String value : environmentIds) {
            getEnvironmentIds().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentIds If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withEnvironmentIds(java.util.Collection<String> environmentIds) {
        java.util.List<String> environmentIdsCopy = new java.util.ArrayList<String>();
        if (environmentIds != null) {
            environmentIdsCopy.addAll(environmentIds);
        }
        this.environmentIds = environmentIdsCopy;

        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified names.
     */
    public java.util.List<String> getEnvironmentNames() {
        
        if (environmentNames == null) {
            environmentNames = new java.util.ArrayList<String>();
        }
        return environmentNames;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     *
     * @param environmentNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified names.
     */
    public void setEnvironmentNames(java.util.Collection<String> environmentNames) {
        java.util.List<String> environmentNamesCopy = new java.util.ArrayList<String>();
        if (environmentNames != null) {
            environmentNamesCopy.addAll(environmentNames);
        }
        this.environmentNames = environmentNamesCopy;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withEnvironmentNames(String... environmentNames) {
        if (getEnvironmentNames() == null) setEnvironmentNames(new java.util.ArrayList<String>());
        for (String value : environmentNames) {
            getEnvironmentNames().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withEnvironmentNames(java.util.Collection<String> environmentNames) {
        java.util.List<String> environmentNamesCopy = new java.util.ArrayList<String>();
        if (environmentNames != null) {
            environmentNamesCopy.addAll(environmentNames);
        }
        this.environmentNames = environmentNamesCopy;

        return this;
    }
    
    /**
     * Indicates whether to include deleted environments: <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed. <p>
     * <code>false</code>: Do not include deleted environments.
     *
     * @return Indicates whether to include deleted environments: <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed. <p>
     *         <code>false</code>: Do not include deleted environments.
     */
    public Boolean isIncludeDeleted() {
        return includeDeleted;
    }
    
    /**
     * Indicates whether to include deleted environments: <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed. <p>
     * <code>false</code>: Do not include deleted environments.
     *
     * @param includeDeleted Indicates whether to include deleted environments: <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed. <p>
     *         <code>false</code>: Do not include deleted environments.
     */
    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }
    
    /**
     * Indicates whether to include deleted environments: <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed. <p>
     * <code>false</code>: Do not include deleted environments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeDeleted Indicates whether to include deleted environments: <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed. <p>
     *         <code>false</code>: Do not include deleted environments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    
    /**
     * Indicates whether to include deleted environments: <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed. <p>
     * <code>false</code>: Do not include deleted environments.
     *
     * @return Indicates whether to include deleted environments: <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed. <p>
     *         <code>false</code>: Do not include deleted environments.
     */
    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }
    
    /**
     * If specified when <code>IncludeDeleted</code> is set to
     * <code>true</code>, then environments deleted after this date are
     * displayed.
     *
     * @return If specified when <code>IncludeDeleted</code> is set to
     *         <code>true</code>, then environments deleted after this date are
     *         displayed.
     */
    public java.util.Date getIncludedDeletedBackTo() {
        return includedDeletedBackTo;
    }
    
    /**
     * If specified when <code>IncludeDeleted</code> is set to
     * <code>true</code>, then environments deleted after this date are
     * displayed.
     *
     * @param includedDeletedBackTo If specified when <code>IncludeDeleted</code> is set to
     *         <code>true</code>, then environments deleted after this date are
     *         displayed.
     */
    public void setIncludedDeletedBackTo(java.util.Date includedDeletedBackTo) {
        this.includedDeletedBackTo = includedDeletedBackTo;
    }
    
    /**
     * If specified when <code>IncludeDeleted</code> is set to
     * <code>true</code>, then environments deleted after this date are
     * displayed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includedDeletedBackTo If specified when <code>IncludeDeleted</code> is set to
     *         <code>true</code>, then environments deleted after this date are
     *         displayed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEnvironmentsRequest withIncludedDeletedBackTo(java.util.Date includedDeletedBackTo) {
        this.includedDeletedBackTo = includedDeletedBackTo;
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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("EnvironmentIds: " + environmentIds + ", ");
        sb.append("EnvironmentNames: " + environmentNames + ", ");
        sb.append("IncludeDeleted: " + includeDeleted + ", ");
        sb.append("IncludedDeletedBackTo: " + includedDeletedBackTo + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    