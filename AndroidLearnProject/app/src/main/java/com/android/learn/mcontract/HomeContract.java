package com.android.learn.mcontract;

import com.android.learn.base.mmodel.BannerListData;
import com.android.learn.base.mmodel.FeedArticleListData.FeedArticleData;
import com.android.learn.base.mmodel.FeedArticleListData;

/**
 * Created by gaolei on 2018/6/18.
 */

public class HomeContract {

    public interface Presenter {

        /**
         * Get feed article list
         */
        void getFeedArticleList(int num);

        void getBannerInfo();

        void onRefreshMore();

        void onLoadMore();

        void addCollectArticle(int position, FeedArticleData feedArticleData);

        void cancelCollectArticle(int position, FeedArticleData feedArticleData);
    }

    public interface View {

        void showArticleList(FeedArticleListData itemBeans, boolean isRefresh);

        void showBannerList(BannerListData itemBeans);

        void showCollectArticleData(int position, FeedArticleData feedArticleData);

        void showCancelCollectArticleData(int position, FeedArticleData feedArticleData);
        void showCancelCollectArticleData(int id);
    }
}
