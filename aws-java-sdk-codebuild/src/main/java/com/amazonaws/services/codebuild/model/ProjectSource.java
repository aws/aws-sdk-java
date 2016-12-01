/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the build project's build input source code.
 * </p>
 */
public class ProjectSource implements Serializable, Cloneable {

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access token,
     * to the repository that contains the source code and the build spec (for example,
     * <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     * ). For more information, see <a
     * href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access Token
     * for Command-Line Use</a> on the GitHub Help website.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * The build spec declaration to use for this build project's related builds.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     */
    private String buildspec;
    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is only for the AWS CodeBuild console's use. Your code should not get or set this information
     * directly.
     * </p>
     */
    private SourceAuth auth;

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of repository that contains the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *         AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB</code>: The source code is in a GitHub repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setType(SourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code>: The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code>: The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code>: The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ProjectSource withType(SourceType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access token,
     * to the repository that contains the source code and the build spec (for example,
     * <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     * ). For more information, see <a
     * href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access Token
     * for Command-Line Use</a> on the GitHub Help website.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *        is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the build spec (for example,
     *        <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *        that contains the source code (for example,
     *        <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access
     *        token, to the repository that contains the source code and the build spec (for example,
     *        <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     *        ). For more information, see <a
     *        href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access
     *        Token for Command-Line Use</a> on the GitHub Help website.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access token,
     * to the repository that contains the source code and the build spec (for example,
     * <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     * ). For more information, see <a
     * href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access Token
     * for Command-Line Use</a> on the GitHub Help website.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the location of the source code to be built. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *         <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *         is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *         source code and the build spec (for example,
     *         <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *         that contains the source code (for example,
     *         <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access
     *         token, to the repository that contains the source code and the build spec (for example,
     *         <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     *         ). For more information, see <a
     *         href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access
     *         Token for Command-Line Use</a> on the GitHub Help website.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     * <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This is
     * because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the build spec (for example,
     * <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file that
     * contains the source code (for example,
     * <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access token,
     * to the repository that contains the source code and the build spec (for example,
     * <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     * ). For more information, see <a
     * href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access Token
     * for Command-Line Use</a> on the GitHub Help website.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        <code>location</code> should not be specified. If it is specified, AWS CodePipeline will ignore it. This
     *        is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the build spec (for example,
     *        <code>https://git-codecommit.<i>region-ID</i>.amazonaws.com/v1/repos/<i>repo-name</i> </code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, the path to the ZIP file
     *        that contains the source code (for example,
     *        <code> <i>bucket-name</i>/<i>path</i>/<i>to</i>/<i>object-name</i>.zip</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL, including the user name and personal access
     *        token, to the repository that contains the source code and the build spec (for example,
     *        <code>https://<i>login-user-name</i>:<i>personal-access-token</i>@github.com/<i>repo-owner-name</i>/<i>repo-name</i>.git</code>
     *        ). For more information, see <a
     *        href="https://help.github.com/articles/creating-an-access-token-for-command-line-use/">Creating an Access
     *        Token for Command-Line Use</a> on the GitHub Help website.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The build spec declaration to use for this build project's related builds.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @param buildspec
     *        The build spec declaration to use for this build project's related builds.</p>
     *        <p>
     *        If this value is not specified, a build spec must be included along with the source code to be built.
     */

    public void setBuildspec(String buildspec) {
        this.buildspec = buildspec;
    }

    /**
     * <p>
     * The build spec declaration to use for this build project's related builds.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @return The build spec declaration to use for this build project's related builds.</p>
     *         <p>
     *         If this value is not specified, a build spec must be included along with the source code to be built.
     */

    public String getBuildspec() {
        return this.buildspec;
    }

    /**
     * <p>
     * The build spec declaration to use for this build project's related builds.
     * </p>
     * <p>
     * If this value is not specified, a build spec must be included along with the source code to be built.
     * </p>
     * 
     * @param buildspec
     *        The build spec declaration to use for this build project's related builds.</p>
     *        <p>
     *        If this value is not specified, a build spec must be included along with the source code to be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withBuildspec(String buildspec) {
        setBuildspec(buildspec);
        return this;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is only for the AWS CodeBuild console's use. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is only for the AWS CodeBuild console's use. Your code should not get or set this
     *        information directly.
     */

    public void setAuth(SourceAuth auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is only for the AWS CodeBuild console's use. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @return Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *         <p>
     *         This information is only for the AWS CodeBuild console's use. Your code should not get or set this
     *         information directly.
     */

    public SourceAuth getAuth() {
        return this.auth;
    }

    /**
     * <p>
     * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
     * </p>
     * <p>
     * This information is only for the AWS CodeBuild console's use. Your code should not get or set this information
     * directly.
     * </p>
     * 
     * @param auth
     *        Information about the authorization settings for AWS CodeBuild to access the source code to be built.</p>
     *        <p>
     *        This information is only for the AWS CodeBuild console's use. Your code should not get or set this
     *        information directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSource withAuth(SourceAuth auth) {
        setAuth(auth);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getBuildspec() != null)
            sb.append("Buildspec: " + getBuildspec() + ",");
        if (getAuth() != null)
            sb.append("Auth: " + getAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSource == false)
            return false;
        ProjectSource other = (ProjectSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBuildspec() == null ^ this.getBuildspec() == null)
            return false;
        if (other.getBuildspec() != null && other.getBuildspec().equals(this.getBuildspec()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBuildspec() == null) ? 0 : getBuildspec().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSource clone() {
        try {
            return (ProjectSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
