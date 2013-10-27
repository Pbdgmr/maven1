package org.apache.maven.scm.provider.git.jgit.command.tag;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.io.IOException;

import org.apache.maven.scm.provider.git.GitScmTestUtils;
import org.apache.maven.scm.provider.git.command.tag.GitTagCommandTckTest;
import org.eclipse.jgit.util.FileUtils;

/**
 * This test tests the tag command.
 *
 * @author <a href="mailto:struberg@yahoo.de">Mark Struberg</a>
 */
public class JGitTagCommandTckTest
    extends GitTagCommandTckTest
{
    /**
     * {@inheritDoc}
     */
    public String getScmUrl()
        throws Exception
    {
        return GitScmTestUtils.getScmUrl( getRepositoryRoot(), "jgit" );
    }

    @Override
    protected void deleteDirectory( File directory )
        throws IOException
    {
        if ( directory.exists() )
        {
            FileUtils.delete( directory, FileUtils.RECURSIVE | FileUtils.RETRY );
        }
    }
}
