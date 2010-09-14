class GuestbookController < ApplicationController
  def sign
    post = Post.create({:message => params[:message]})
    post.save!
    redirect_to "/guestbook"
  end

  def index
    @posts = Post.all
  end
end
