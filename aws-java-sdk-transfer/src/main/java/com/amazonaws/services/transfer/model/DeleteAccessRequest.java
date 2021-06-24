/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this user assigned.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * A unique identifier that is required to identify specific groups within your directory. The users of the group
     * that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Amazon
     * Web Services Transfer Family. If you know the group name, you can view the SID values by running the following
     * command using Windows PowerShell.
     * </p>
     * <p>
     * <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     * </p>
     * <p>
     * In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this user assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has this user assigned.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this user assigned.
     * </p>
     * 
     * @return A system-assigned unique identifier for a server that has this user assigned.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this user assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has this user assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccessRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * A unique identifier that is required to identify specific groups within your directory. The users of the group
     * that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Amazon
     * Web Services Transfer Family. If you know the group name, you can view the SID values by running the following
     * command using Windows PowerShell.
     * </p>
     * <p>
     * <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     * </p>
     * <p>
     * In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is required to identify specific groups within your directory. The users of the
     *        group that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols
     *        using Amazon Web Services Transfer Family. If you know the group name, you can view the SID values by
     *        running the following command using Windows PowerShell.</p>
     *        <p>
     *        <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     *        </p>
     *        <p>
     *        In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     *        </p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that is required to identify specific groups within your directory. The users of the group
     * that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Amazon
     * Web Services Transfer Family. If you know the group name, you can view the SID values by running the following
     * command using Windows PowerShell.
     * </p>
     * <p>
     * <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     * </p>
     * <p>
     * In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @return A unique identifier that is required to identify specific groups within your directory. The users of the
     *         group that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols
     *         using Amazon Web Services Transfer Family. If you know the group name, you can view the SID values by
     *         running the following command using Windows PowerShell.</p>
     *         <p>
     *         <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     *         </p>
     *         <p>
     *         In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@:/-
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that is required to identify specific groups within your directory. The users of the group
     * that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Amazon
     * Web Services Transfer Family. If you know the group name, you can view the SID values by running the following
     * command using Windows PowerShell.
     * </p>
     * <p>
     * <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     * </p>
     * <p>
     * In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is required to identify specific groups within your directory. The users of the
     *        group that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols
     *        using Amazon Web Services Transfer Family. If you know the group name, you can view the SID values by
     *        running the following command using Windows PowerShell.</p>
     *        <p>
     *        <code>Get-ADGroup -Filter {samAccountName -like "<i>YourGroupName</i>*"} -Properties * | Select SamAccountName,ObjectSid</code>
     *        </p>
     *        <p>
     *        In that command, replace <i>YourGroupName</i> with the name of your Active Directory group.
     *        </p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccessRequest withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccessRequest == false)
            return false;
        DeleteAccessRequest other = (DeleteAccessRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccessRequest clone() {
        return (DeleteAccessRequest) super.clone();
    }

}
