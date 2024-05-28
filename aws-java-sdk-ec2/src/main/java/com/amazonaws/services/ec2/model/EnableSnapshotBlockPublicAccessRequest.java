/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableSnapshotBlockPublicAccessRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableSnapshotBlockPublicAccessRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<EnableSnapshotBlockPublicAccessRequest> {

    /**
     * <p>
     * The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the account
     * will no longer be able to request new public sharing. Additionally, snapshots that are already publicly shared
     * are treated as private and they are no longer publicly available.
     * </p>
     * <note>
     * <p>
     * If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change the
     * permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from be publicly
     * visible and publicly accessible. Therefore, the attributes for these snapshots still indicate that they are
     * publicly shared, even though they are not publicly available.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. However, snapshots that are already publicly
     * shared, remain publicly available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the account
     * will no longer be able to request new public sharing. Additionally, snapshots that are already publicly shared
     * are treated as private and they are no longer publicly available.
     * </p>
     * <note>
     * <p>
     * If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change the
     * permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from be publicly
     * visible and publicly accessible. Therefore, the attributes for these snapshots still indicate that they are
     * publicly shared, even though they are not publicly available.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. However, snapshots that are already publicly
     * shared, remain publicly available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * </p>
     * 
     * @param state
     *        The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. Additionally, snapshots that are already
     *        publicly shared are treated as private and they are no longer publicly available.
     *        </p>
     *        <note>
     *        <p>
     *        If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change
     *        the permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from
     *        be publicly visible and publicly accessible. Therefore, the attributes for these snapshots still indicate
     *        that they are publicly shared, even though they are not publicly available.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. However, snapshots that are already publicly
     *        shared, remain publicly available.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * @see SnapshotBlockPublicAccessState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the account
     * will no longer be able to request new public sharing. Additionally, snapshots that are already publicly shared
     * are treated as private and they are no longer publicly available.
     * </p>
     * <note>
     * <p>
     * If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change the
     * permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from be publicly
     * visible and publicly accessible. Therefore, the attributes for these snapshots still indicate that they are
     * publicly shared, even though they are not publicly available.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. However, snapshots that are already publicly
     * shared, remain publicly available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * </p>
     * 
     * @return The mode in which to enable block public access for snapshots for the Region. Specify one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the
     *         account will no longer be able to request new public sharing. Additionally, snapshots that are already
     *         publicly shared are treated as private and they are no longer publicly available.
     *         </p>
     *         <note>
     *         <p>
     *         If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not
     *         change the permissions for snapshots that are already publicly shared. Instead, it prevents these
     *         snapshots from be publicly visible and publicly accessible. Therefore, the attributes for these snapshots
     *         still indicate that they are publicly shared, even though they are not publicly available.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in
     *         the account will no longer be able to request new public sharing. However, snapshots that are already
     *         publicly shared, remain publicly available.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * @see SnapshotBlockPublicAccessState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the account
     * will no longer be able to request new public sharing. Additionally, snapshots that are already publicly shared
     * are treated as private and they are no longer publicly available.
     * </p>
     * <note>
     * <p>
     * If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change the
     * permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from be publicly
     * visible and publicly accessible. Therefore, the attributes for these snapshots still indicate that they are
     * publicly shared, even though they are not publicly available.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. However, snapshots that are already publicly
     * shared, remain publicly available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * </p>
     * 
     * @param state
     *        The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. Additionally, snapshots that are already
     *        publicly shared are treated as private and they are no longer publicly available.
     *        </p>
     *        <note>
     *        <p>
     *        If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change
     *        the permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from
     *        be publicly visible and publicly accessible. Therefore, the attributes for these snapshots still indicate
     *        that they are publicly shared, even though they are not publicly available.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. However, snapshots that are already publicly
     *        shared, remain publicly available.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public EnableSnapshotBlockPublicAccessRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the account
     * will no longer be able to request new public sharing. Additionally, snapshots that are already publicly shared
     * are treated as private and they are no longer publicly available.
     * </p>
     * <note>
     * <p>
     * If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change the
     * permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from be publicly
     * visible and publicly accessible. Therefore, the attributes for these snapshots still indicate that they are
     * publicly shared, even though they are not publicly available.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. However, snapshots that are already publicly
     * shared, remain publicly available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * </p>
     * 
     * @param state
     *        The mode in which to enable block public access for snapshots for the Region. Specify one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - Prevents all public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. Additionally, snapshots that are already
     *        publicly shared are treated as private and they are no longer publicly available.
     *        </p>
     *        <note>
     *        <p>
     *        If you enable block public access for snapshots in <code>block-all-sharing</code> mode, it does not change
     *        the permissions for snapshots that are already publicly shared. Instead, it prevents these snapshots from
     *        be publicly visible and publicly accessible. Therefore, the attributes for these snapshots still indicate
     *        that they are publicly shared, even though they are not publicly available.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Prevents only new public sharing of snapshots in the Region. Users in the
     *        account will no longer be able to request new public sharing. However, snapshots that are already publicly
     *        shared, remain publicly available.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>unblocked</code> is not a valid value for <b>EnableSnapshotBlockPublicAccess</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public EnableSnapshotBlockPublicAccessRequest withState(SnapshotBlockPublicAccessState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<EnableSnapshotBlockPublicAccessRequest> getDryRunRequest() {
        Request<EnableSnapshotBlockPublicAccessRequest> request = new EnableSnapshotBlockPublicAccessRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSnapshotBlockPublicAccessRequest == false)
            return false;
        EnableSnapshotBlockPublicAccessRequest other = (EnableSnapshotBlockPublicAccessRequest) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public EnableSnapshotBlockPublicAccessRequest clone() {
        return (EnableSnapshotBlockPublicAccessRequest) super.clone();
    }
}
