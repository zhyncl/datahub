package com.linkedin.metadata.restli;

import com.linkedin.metadata.query.BrowseResult;
import com.linkedin.r2.RemoteInvocationException;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;


/**
 * Interface which all entities supporting browse should implement in their respective restli MPs
 */
public interface BrowsableClient {

  @Nonnull
  BrowseResult browse(@Nonnull String inputPath, @Nullable Map<String, String> requestFilters, int from,
      int size) throws RemoteInvocationException;

}