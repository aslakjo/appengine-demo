class Post
  include DataMapper::Resource
  storage_names[:default] = "Post"
  
  property :id,      Serial
  property :message, String,        :required => true, :length => 500
  timestamps :at 
end
