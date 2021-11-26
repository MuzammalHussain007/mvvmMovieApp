package com.blinkedgewillsun.mvvmmovieapp.MovieModal;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModalCLass implements Parcelable {
    private String title,overview,poster_path,release_date;
    private int id;
    private float vote_average;

    protected MovieModalCLass(Parcel in) {
        title = in.readString();
        overview = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        id = in.readInt();
        vote_average = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(poster_path);
        dest.writeString(release_date);
        dest.writeInt(id);
        dest.writeFloat(vote_average);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MovieModalCLass> CREATOR = new Creator<MovieModalCLass>() {
        @Override
        public MovieModalCLass createFromParcel(Parcel in) {
            return new MovieModalCLass(in);
        }

        @Override
        public MovieModalCLass[] newArray(int size) {
            return new MovieModalCLass[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public MovieModalCLass() {
    }

    public MovieModalCLass(String title, String overview, String poster_path, String release_date, int id, float vote_average) {
        this.title = title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.id = id;
        this.vote_average = vote_average;
    }
}
