/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironments(DescribeEnvironmentsRequest) DescribeEnvironments operation}.
 * <p>
 * Returns descriptions for existing environments.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironments(DescribeEnvironmentsRequest)
 */
public class DescribeEnvironmentsRequest extends AmazonWebServiceRequest implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentIds;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those that have the specified names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentNames;

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
              environmentIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              environmentIds.setAutoConstruct(true);
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
        if (environmentIds == null) {
            this.environmentIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(environmentIds.size());
        environmentIdsCopy.addAll(environmentIds);
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
        if (getEnvironmentIds() == null) setEnvironmentIds(new java.util.ArrayList<String>(environmentIds.length));
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
        if (environmentIds == null) {
            this.environmentIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(environmentIds.size());
            environmentIdsCopy.addAll(environmentIds);
            this.environmentIds = environmentIdsCopy;
        }

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
              environmentNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              environmentNames.setAutoConstruct(true);
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
        if (environmentNames == null) {
            this.environmentNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(environmentNames.size());
        environmentNamesCopy.addAll(environmentNames);
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
        if (getEnvironmentNames() == null) setEnvironmentNames(new java.util.ArrayList<String>(environmentNames.length));
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
        if (environmentNames == null) {
            this.environmentNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> environmentNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(environmentNames.size());
            environmentNamesCopy.addAll(environmentNames);
            this.environmentNames = environmentNamesCopy;
        }

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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getEnvironmentIds() != null) sb.append("EnvironmentIds: " + getEnvironmentIds() + ",");
        if (getEnvironmentNames() != null) sb.append("EnvironmentNames: " + getEnvironmentNames() + ",");
        if (isIncludeDeleted() != null) sb.append("IncludeDeleted: " + isIncludeDeleted() + ",");
        if (getIncludedDeletedBackTo() != null) sb.append("IncludedDeletedBackTo: " + getIncludedDeletedBackTo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentIds() == null) ? 0 : getEnvironmentIds().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentNames() == null) ? 0 : getEnvironmentNames().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeDeleted() == null) ? 0 : isIncludeDeleted().hashCode()); 
        hashCode = prime * hashCode + ((getIncludedDeletedBackTo() == null) ? 0 : getIncludedDeletedBackTo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEnvironmentsRequest == false) return false;
        DescribeEnvironmentsRequest other = (DescribeEnvironmentsRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.getEnvironmentIds() == null ^ this.getEnvironmentIds() == null) return false;
        if (other.getEnvironmentIds() != null && other.getEnvironmentIds().equals(this.getEnvironmentIds()) == false) return false; 
        if (other.getEnvironmentNames() == null ^ this.getEnvironmentNames() == null) return false;
        if (other.getEnvironmentNames() != null && other.getEnvironmentNames().equals(this.getEnvironmentNames()) == false) return false; 
        if (other.isIncludeDeleted() == null ^ this.isIncludeDeleted() == null) return false;
        if (other.isIncludeDeleted() != null && other.isIncludeDeleted().equals(this.isIncludeDeleted()) == false) return false; 
        if (other.getIncludedDeletedBackTo() == null ^ this.getIncludedDeletedBackTo() == null) return false;
        if (other.getIncludedDeletedBackTo() != null && other.getIncludedDeletedBackTo().equals(this.getIncludedDeletedBackTo()) == false) return false; 
        return true;
    }
    
}
    