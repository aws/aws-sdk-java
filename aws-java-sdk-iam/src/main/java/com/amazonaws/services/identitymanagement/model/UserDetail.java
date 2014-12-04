/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an IAM user, including all the user's
 * policies and all the IAM groups the user is in.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * GetAccountAuthorizationDetails action.
 * </p>
 */
public class UserDetail implements Serializable {

    /**
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     */
    private String path;

    /**
     * The friendly name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String userId;

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the user was created.
     */
    private java.util.Date createDate;

    /**
     * A list of the user's policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> userPolicyList;

    /**
     * A list of IAM groups that the user is in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupList;

    /**
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @return The path to the user. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param path The path to the user. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(&#92;u002F)|(&#92;u002F[&#92;u0021-&#92;u007F]+&#92;u002F)<br/>
     *
     * @param path The path to the user. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The friendly name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The friendly name identifying the user.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The friendly name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The friendly name identifying the user.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The friendly name identifying the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The friendly name identifying the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param userId The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param userId The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the user was created.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the user was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the user was created.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the user was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the user was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the user was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * A list of the user's policies.
     *
     * @return A list of the user's policies.
     */
    public java.util.List<PolicyDetail> getUserPolicyList() {
        if (userPolicyList == null) {
              userPolicyList = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>();
              userPolicyList.setAutoConstruct(true);
        }
        return userPolicyList;
    }
    
    /**
     * A list of the user's policies.
     *
     * @param userPolicyList A list of the user's policies.
     */
    public void setUserPolicyList(java.util.Collection<PolicyDetail> userPolicyList) {
        if (userPolicyList == null) {
            this.userPolicyList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> userPolicyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>(userPolicyList.size());
        userPolicyListCopy.addAll(userPolicyList);
        this.userPolicyList = userPolicyListCopy;
    }
    
    /**
     * A list of the user's policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userPolicyList A list of the user's policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withUserPolicyList(PolicyDetail... userPolicyList) {
        if (getUserPolicyList() == null) setUserPolicyList(new java.util.ArrayList<PolicyDetail>(userPolicyList.length));
        for (PolicyDetail value : userPolicyList) {
            getUserPolicyList().add(value);
        }
        return this;
    }
    
    /**
     * A list of the user's policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userPolicyList A list of the user's policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withUserPolicyList(java.util.Collection<PolicyDetail> userPolicyList) {
        if (userPolicyList == null) {
            this.userPolicyList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail> userPolicyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDetail>(userPolicyList.size());
            userPolicyListCopy.addAll(userPolicyList);
            this.userPolicyList = userPolicyListCopy;
        }

        return this;
    }

    /**
     * A list of IAM groups that the user is in.
     *
     * @return A list of IAM groups that the user is in.
     */
    public java.util.List<String> getGroupList() {
        if (groupList == null) {
              groupList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupList.setAutoConstruct(true);
        }
        return groupList;
    }
    
    /**
     * A list of IAM groups that the user is in.
     *
     * @param groupList A list of IAM groups that the user is in.
     */
    public void setGroupList(java.util.Collection<String> groupList) {
        if (groupList == null) {
            this.groupList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupList.size());
        groupListCopy.addAll(groupList);
        this.groupList = groupListCopy;
    }
    
    /**
     * A list of IAM groups that the user is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupList A list of IAM groups that the user is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withGroupList(String... groupList) {
        if (getGroupList() == null) setGroupList(new java.util.ArrayList<String>(groupList.length));
        for (String value : groupList) {
            getGroupList().add(value);
        }
        return this;
    }
    
    /**
     * A list of IAM groups that the user is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupList A list of IAM groups that the user is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserDetail withGroupList(java.util.Collection<String> groupList) {
        if (groupList == null) {
            this.groupList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupList.size());
            groupListCopy.addAll(groupList);
            this.groupList = groupListCopy;
        }

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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null) sb.append("UserId: " + getUserId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUserPolicyList() != null) sb.append("UserPolicyList: " + getUserPolicyList() + ",");
        if (getGroupList() != null) sb.append("GroupList: " + getGroupList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUserPolicyList() == null) ? 0 : getUserPolicyList().hashCode()); 
        hashCode = prime * hashCode + ((getGroupList() == null) ? 0 : getGroupList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserDetail == false) return false;
        UserDetail other = (UserDetail)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getUserPolicyList() == null ^ this.getUserPolicyList() == null) return false;
        if (other.getUserPolicyList() != null && other.getUserPolicyList().equals(this.getUserPolicyList()) == false) return false; 
        if (other.getGroupList() == null ^ this.getGroupList() == null) return false;
        if (other.getGroupList() != null && other.getGroupList().equals(this.getGroupList()) == false) return false; 
        return true;
    }
    
}
    